package br.com.banco.entities.dtos;

import br.com.banco.entities.Transferencia;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
public class TransferenciaDTO {

    public LocalDate dataTransferencia;
    private Double valor;
    private String tipo;
    private String nomeOperador;

    public TransferenciaDTO(LocalDateTime dataTransferencia, Double valor, String tipo, String nomeOperador) {
        setData(dataTransferencia);
        this.valor = valor;
        this.tipo = tipo;
        this.nomeOperador = nomeOperador;
    }

    public void setData(LocalDateTime data) {
        this.dataTransferencia = data != null ? data.toLocalDate() : null;
    }

    public static TransferenciaDTO fromTransferencia(Transferencia transferencia) {
        TransferenciaDTO transferenciaDTO = new TransferenciaDTO();
        transferenciaDTO.setData(transferencia.getDataTransferencia());
        transferenciaDTO.setValor(transferencia.getValor());
        transferenciaDTO.setTipo(transferencia.getTipo());
        transferenciaDTO.setNomeOperador(transferencia.getNomeOperadorTransacao());
        return transferenciaDTO;
    }
}
