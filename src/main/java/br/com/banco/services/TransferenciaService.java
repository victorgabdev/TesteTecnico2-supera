package br.com.banco.services;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import br.com.banco.entities.dtos.TransferenciaDTO;
import br.com.banco.exceptions.CustomException;
import br.com.banco.repositories.ContaRepository;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TransferenciaService {

    @Autowired
    ContaRepository contaRepository;

    @Autowired
    TransferenciaRepository transferenciaRepository;

    public List<TransferenciaDTO> getAll() {
        List<Transferencia> transferencias = transferenciaRepository.findAll();
        return TransferenciaDTO.fromTransferencias(transferencias);
    }

    public List<TransferenciaDTO> getAllByContaId(Long contaId) {
        // Se não existir a conta
        Optional<Conta> conta = contaRepository.findById(contaId);
        if(conta.isEmpty()) throw  new CustomException("Conta Não Existe", HttpStatus.NOT_FOUND);

        List<Transferencia> transferencias = conta.get().getTransferencias();
        return TransferenciaDTO.fromTransferencias(transferencias);
    }
}
