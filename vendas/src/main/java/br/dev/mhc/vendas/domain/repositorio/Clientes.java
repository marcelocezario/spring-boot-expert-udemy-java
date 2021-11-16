package br.dev.mhc.vendas.domain.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.mhc.vendas.domain.entity.Cliente;

public interface Clientes extends JpaRepository<Cliente, Integer> {
	
	List<Cliente> findByNomeLike(String nome);

}
