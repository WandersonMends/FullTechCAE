package br.com.jffw.cae.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jffw.cae.models.Vaga;

public interface VagaRepository extends JpaRepository<Vaga, Integer> {
	
}