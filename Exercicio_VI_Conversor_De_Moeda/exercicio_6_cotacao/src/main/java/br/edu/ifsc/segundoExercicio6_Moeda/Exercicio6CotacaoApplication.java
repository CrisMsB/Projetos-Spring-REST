package br.edu.ifsc.segundoExercicio6_Moeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio6CotacaoApplication {

	public static void main(String[] args) {
		MoedaDataSource.criarLista();
		SpringApplication.run(Exercicio6CotacaoApplication.class, args);
	}

}
