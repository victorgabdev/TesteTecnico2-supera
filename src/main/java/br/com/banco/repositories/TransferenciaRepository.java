package br.com.banco.repositories;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
    List<Transferencia> findByContaId(Conta conta);

    Page<Transferencia> findByConta(Conta conta, Pageable pageable);

    List<Transferencia> findByContaAndDataTransferenciaBetween(Conta conta, LocalDate inicio, LocalDate fim);

    Page<Transferencia> findByContaAndDataTransferenciaBetween(Conta conta, LocalDate inicio, LocalDate fim, Pageable pageable);

    List<Transferencia> findByContaAndNomeOperadorTransacao(Conta conta, String nomeOperador);

    Page<Transferencia> findByContaAndNomeOperadorTransacao(Conta conta, String nomeOperador, Pageable pageable);

    List<Transferencia> findByContaAndDataTransferenciaBetweenAndNomeOperadorTransacao(Conta conta, LocalDate inicio, LocalDate fim, String nomeOperador);

    Page<Transferencia> findByContaAndDataTransferenciaBetweenAndNomeOperadorTransacao(Conta conta, LocalDate inicio, LocalDate fim, String nomeOperador, Pageable pageable);
}
