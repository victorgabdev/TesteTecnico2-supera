package br.com.banco.services;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import br.com.banco.entities.dtos.TransferenciaDTO;
import br.com.banco.repositories.ContaRepository;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransferenciaService {

    @Autowired
    ContaRepository contaRepository;

    @Autowired
    TransferenciaRepository transferenciaRepository;

    public TransferenciaDTO findById(Long id) {
        Transferencia transferencia = transferenciaRepository.getById(id);
        return TransferenciaDTO.fromTransferencia(transferencia);
    }
}
