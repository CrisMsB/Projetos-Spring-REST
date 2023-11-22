package br.edu.ifsc.segundoExercicio;

public class Mensagem {
	
	private final long id;
	
	private final String nome;
	
	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Mensagem(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}		
}
