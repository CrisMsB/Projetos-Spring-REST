package br.edu.ifsc.segundoExercicio6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio6Application {

	public static void main(String[] args) {
		FuncionarioDataSource.criarLista();
		SpringApplication.run(Exercicio6Application.class, args);
	}

}
