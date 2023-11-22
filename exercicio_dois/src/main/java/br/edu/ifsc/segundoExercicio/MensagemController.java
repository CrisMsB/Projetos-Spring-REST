package br.edu.ifsc.segundoExercicio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class MensagemController {
	
	private final AtomicLong contador = new AtomicLong();
	
	@RequestMapping("/curso")
	public Mensagem mensagem (@RequestParam(value="nome", defaultValue="curso desconhecido") String nome) {
		return new Mensagem(contador.incrementAndGet(),nome);
	}	
}