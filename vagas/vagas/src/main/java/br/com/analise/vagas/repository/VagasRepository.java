package br.com.analise.vagas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.analise.vagas.model.Vagas;

public interface VagasRepository extends JpaRepository<Vagas, Long>{

}
