package br.com.leandrodesouza.desafio_agendacontatos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.leandrodesouza.desafio_agendacontatos.entities.Agendacontato;

@SpringBootTest (webEnvironment = WebEnvironment.RANDOM_PORT)
class DesafioAgendacontatosApplicationTests {
	
	@Autowired
	
	//cliente de teste reativo que não funciona com abordagem assincrona
	
	private WebTestClient webtestclient;
	
	@Test
	void testCreateAgendaContatoSucess() { 
		var agendacontato = new Agendacontato(null, "Felipe", "Masculino", "147852369");
		
		webtestclient
		.post()
		.uri("/agendacontato")
		.bodyValue(agendacontato)
		.exchange()
		.expectStatus().isOk()
		.expectBody()
		.jsonPath("$").isArray()
		.jsonPath("$.length()").isEqualTo(1)
		.jsonPath("$[0].nome").isEqualTo(agendacontato.getNome())
		.jsonPath("$[0].gênero").isEqualTo(agendacontato.getGênero())
		.jsonPath("$[0].numero").isEqualTo(agendacontato.getNumero());
		
	}
	
	@Test
	void testCreateAgendaContatoFailure() { 
		
		webtestclient
		.post()
		.uri("/agendacontato")
		.bodyValue(new Agendacontato(null, "", "", ""))
		.exchange()
		.expectStatus().isBadRequest();
			
	
	
		
	}

}
