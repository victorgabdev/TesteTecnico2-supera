package br.com.banco.services;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import br.com.banco.entities.dtos.TransferenciaDTO;
import br.com.banco.repositories.ContaRepository;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

        Conta conta = contaRepository.getById(contaId);
        List<Transferencia> transferencias = conta.getTransferencias();
        return TransferenciaDTO.fromTransferencias(transferencias);
    }
}
