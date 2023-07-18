package br.com.banco.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "transferencia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transferencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataTransferencia;
    private Double valor;
    private String tipo;
    private String nomeOperadorTransacao;

    // foreign key de conta
    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Conta conta;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transferencia)) return false;
        Transferencia that = (Transferencia) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
