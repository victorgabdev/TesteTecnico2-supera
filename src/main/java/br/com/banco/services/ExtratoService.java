package br.com.banco.services;

import br.com.banco.entities.Conta;
import br.com.banco.entities.dtos.TransferenciaDTO;
import br.com.banco.exceptions.CustomException;
import br.com.banco.repositories.ContaRepository;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Service
public class ExtratoService {

    @Autowired
    ContaRepository contaRepository;

    @Autowired
    TransferenciaRepository transferenciaRepository;

   public Page<TransferenciaDTO> obterExtrato(Long contaId, LocalDateTime inicio, LocalDateTime fim, String nomeOperadorTransacao, Pageable pageable) {
       // Obter a conta com basa no id fornecido
       Conta conta = contaRepository.findById(contaId).
               orElseThrow(() -> new CustomException("Conta não encontrada", HttpStatus.NOT_FOUND));

       // Caso todos os filtros sejam informados
       if (inicio != null && fim != null && nomeOperadorTransacao != null) {
           return transferenciaRepository.findByContaAndDataTransferenciaBetweenAndNomeOperadorTransacao(conta, inicio, fim, nomeOperadorTransacao, pageable)
                   .map(TransferenciaDTO::fromTransferencia);
       }

       // Caso seja informado um período de tempo (início e fim)
       if (inicio != null && fim != null) {
           return transferenciaRepository.findByContaAndDataTransferenciaBetween(conta, inicio, fim, pageable)
                   .map(TransferenciaDTO::fromTransferencia);
       }

       // Caso seja informado o nome do operador da transação
       if (nomeOperadorTransacao != null) {
           return transferenciaRepository.findByContaAndNomeOperadorTransacao(conta, nomeOperadorTransacao, pageable)
                   .map(TransferenciaDTO::fromTransferencia);
       }

       //  Caso nenhum filtro seja informado
       return transferenciaRepository.findByConta(conta, pageable).map(TransferenciaDTO::fromTransferencia);
   }
}
