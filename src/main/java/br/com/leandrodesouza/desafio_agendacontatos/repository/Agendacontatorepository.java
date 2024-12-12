package br.com.leandrodesouza.desafio_agendacontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leandrodesouza.desafio_agendacontatos.entities.Agendacontato;
import java.util.List;


public interface Agendacontatorepository  extends JpaRepository<Agendacontato, Long>{

	List <Agendacontato> findByNome(String nome);
	
	List <Agendacontato> findByNumero(String numero);
}


