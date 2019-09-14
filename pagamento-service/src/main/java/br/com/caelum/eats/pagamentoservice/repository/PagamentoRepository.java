package br.com.caelum.eats.pagamentoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caelum.eats.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
