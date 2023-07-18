package br.com.banco;

import br.com.banco.entities.dtos.TransferenciaDTO;
import br.com.banco.services.ExtratoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BancoApplicationTests {

    @Autowired
    private ExtratoService extratoService;

    @BeforeEach
    void setUp() {
        // Inicialize quaisquer objetos necessários para o teste
    }

    @Test
    void testObterExtrato() {
        // Crie os objetos necessários para o teste
        Long contaId = 1L;
        LocalDateTime inicio = LocalDateTime.of(2022, 1, 1, 0, 0, 0);
        LocalDateTime fim = LocalDateTime.of(2022, 12, 31, 0, 0, 0);
        String nomeOperadorTransacao = "Beltrano";
        Pageable pageable = PageRequest.of(0, 10);

        // Execute o método a ser testado
        Page<TransferenciaDTO> extrato = extratoService.obterExtrato(contaId, inicio, fim, nomeOperadorTransacao, pageable);

        // Realize asserções para verificar se o resultado está correto
        assertNotNull(extrato);
        // Faça asserções adicionais conforme necessário
    }
}