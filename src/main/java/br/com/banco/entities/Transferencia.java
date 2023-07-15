package br.com.banco.entities;

import br.com.banco.entities.enums.StatusTipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "transferencia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime dataTransferencia;
    private Double valor;
    private StatusTipo tipo;
    private String nomeOperadorTransacao;

    // foreign key de conta
    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Conta conta;
}
