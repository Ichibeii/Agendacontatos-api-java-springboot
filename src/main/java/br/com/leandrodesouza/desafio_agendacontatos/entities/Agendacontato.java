package br.com.leandrodesouza.desafio_agendacontatos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agendacontatos")
public class Agendacontato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String gênero;
	private String numero;

	public Agendacontato() {

	}

	public Agendacontato(Long id, String nome, String gênero, String numero) {
		super();
		this.id = id;
		this.nome = nome;
		this.gênero = gênero;
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGênero() {
		return gênero;
	}

	public void setGênero(String gênero) {
		this.gênero = gênero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
