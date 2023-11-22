package br.edu.ifsc.fln.primeiraatividade;

public class Mensagem {
	private final long id;
	
	private final String conteudo;

	public long getId() {
		return id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public Mensagem(long id, String conteudo) {
		super();
		this.id = id;
		this.conteudo = conteudo;
	}	
}
