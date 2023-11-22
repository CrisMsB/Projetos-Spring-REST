package br.edu.ifsc.segundoExercicioFinal_Livros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LivrosApiFinal {

	public static void main(String[] args) {
		LivroDataSource.criarLista();
		SpringApplication.run(LivrosApiFinal.class, args);
	}

}
