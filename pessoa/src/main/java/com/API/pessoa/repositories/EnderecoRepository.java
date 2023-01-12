package com.API.pessoa.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.API.pessoa.model.Endereco;
import com.API.pessoa.model.Pessoa;

public interface EnderecoRepository extends JpaRepository<Endereco , Long> {

	
	   public Optional<Endereco>findByCidade(String cidade);  
}
