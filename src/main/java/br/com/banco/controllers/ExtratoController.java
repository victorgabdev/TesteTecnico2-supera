package br.com.banco.controllers;

import br.com.banco.entities.dtos.TransferenciaDTO;
import br.com.banco.services.ExtratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/extrato")
public class ExtratoController {

    @Autowired
    ExtratoService extratoService;

    // Levei em consideração que o numero da conta será o id da conta
    @GetMapping
    public ResponseEntity<List<TransferenciaDTO>> getExtrato(
            @RequestParam(required = false) Long numeroConta,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate inicio,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fim,
            @RequestParam(required = false) String nomeOperador
            ) {

        // List<TransferenciaDTO> extrato = extratoService.obterExtrato(numeroConta, inicio, fim, nomeOperador);

    }


}
