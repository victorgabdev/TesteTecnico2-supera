package br.com.banco.controllers;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import br.com.banco.entities.dtos.TransferenciaDTO;
import br.com.banco.services.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transferencias")
public class TransferenciasController {

    @Autowired
    TransferenciaService transferenciaService;

    // Retornar todas as trnasferências
    // Retornar todas as transferências de acordo com número da conta bancária
    // Retornar todas as transferências de acordo com um período de tempo
    // Retornar todas as transferências relacionadas ao nome do operador
    // Retornar todas as transferências de acordo com com um período de tempo e o nome do operador
    //



}
