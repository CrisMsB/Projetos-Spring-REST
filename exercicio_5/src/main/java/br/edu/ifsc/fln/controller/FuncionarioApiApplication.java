package br.edu.ifsc.fln.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FuncionarioApiApplication {

	public static void main(String[] args) {
		
		FuncionarioDataSource.criarLista();		
		SpringApplication.run(FuncionarioApiApplication.class, args);
	}

}
