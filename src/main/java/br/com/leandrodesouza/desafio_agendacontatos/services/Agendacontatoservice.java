package br.com.leandrodesouza.desafio_agendacontatos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.leandrodesouza.desafio_agendacontatos.entities.Agendacontato;
import br.com.leandrodesouza.desafio_agendacontatos.repository.Agendacontatorepository;

@Service
public class Agendacontatoservice {

	private Agendacontatorepository agendacontatorepository;

	@Autowired
	public Agendacontatoservice(Agendacontatorepository agendacontatorepository) {
		this.agendacontatorepository = agendacontatorepository;
	}

	public List<Agendacontato> create(Agendacontato agendacontato) {
		agendacontatorepository.save(agendacontato);
		return list();
	}

	public List<Agendacontato> list() {

		return agendacontatorepository.findAll(Sort.by("id").ascending());
	}

	public List<Agendacontato> update(Agendacontato agendacontato) {
		agendacontatorepository.save(agendacontato);
		return list();
	}

	public List<Agendacontato> delete(Long id) {

		agendacontatorepository.deleteById(id);
		return list();
	}
	
	public List<Agendacontato> buscarPorNome (String nome) {
		return agendacontatorepository.findByNome(nome);
	}
	
	public List<Agendacontato> buscarPorNumero (String numero) {
		return agendacontatorepository.findByNumero(numero);
	}
}
