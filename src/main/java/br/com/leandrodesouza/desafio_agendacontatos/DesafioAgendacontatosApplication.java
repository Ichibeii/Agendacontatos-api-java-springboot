package br.com.leandrodesouza.desafio_agendacontatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.leandrodesouza.desafio_agendacontatos")
public class DesafioAgendacontatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioAgendacontatosApplication.class, args);
	}

}
