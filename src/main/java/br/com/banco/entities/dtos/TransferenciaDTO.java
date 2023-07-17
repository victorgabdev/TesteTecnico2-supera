package br.com.banco.entities.dtos;

import br.com.banco.entities.Transferencia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferenciaDTO {

    public LocalDate dataTransferencia;
    private Double valor;
    private String tipo;
    private String nomeOperadorTransacao;

    public static TransferenciaDTO fromTransferencia(Transferencia transferencia) {
        return new TransferenciaDTO(
                transferencia.getDataTransferencia().toLocalDate(),
                transferencia.getValor(),
                transferencia.getTipo(),
                transferencia.getNomeOperadorTransacao());
    }
}
