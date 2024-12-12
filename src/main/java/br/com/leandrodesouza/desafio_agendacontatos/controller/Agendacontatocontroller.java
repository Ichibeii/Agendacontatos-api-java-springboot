package br.com.leandrodesouza.desafio_agendacontatos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leandrodesouza.desafio_agendacontatos.entities.Agendacontato;
import br.com.leandrodesouza.desafio_agendacontatos.services.Agendacontatoservice;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/agendacontato")
public class Agendacontatocontroller {

	private Agendacontatoservice agendacontatoservice;
	
	
	@Autowired
    public Agendacontatocontroller(Agendacontatoservice agendacontatoservice) {
        this.agendacontatoservice = agendacontatoservice;
    }
	
	@PostMapping
	List<Agendacontato> create(@RequestBody @Valid Agendacontato agendacontato) {
	return agendacontatoservice.create(agendacontato);
	}

	@GetMapping
	List<Agendacontato> list() {
		return agendacontatoservice.list();
	}

	@PutMapping
	List<Agendacontato> update(@RequestBody Agendacontato agendacontato) {
		return agendacontatoservice.update(agendacontato);
	}

	@DeleteMapping ("/{id}")
	List<Agendacontato> delete(@ PathVariable ("id") Long id) {
		return agendacontatoservice.delete(id);
	}
	
	@GetMapping ("/search/nome/{nome}")
	public List <Agendacontato> buscarPorNome (@PathVariable String nome) {
		return agendacontatoservice.buscarPorNome(nome);
	}
	
	@GetMapping ("/search/numero/{numero}")
	public List <Agendacontato> buscarPorNumero (@PathVariable String numero) {
		return agendacontatoservice.buscarPorNumero(numero);
	}
	
}
