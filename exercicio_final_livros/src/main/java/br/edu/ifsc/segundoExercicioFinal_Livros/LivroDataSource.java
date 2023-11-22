package br.edu.ifsc.segundoExercicioFinal_Livros;

import java.util.ArrayList;
import java.util.List;

public class LivroDataSource {
	private static List<Livro> livros = new ArrayList<>();

	public static void criarLista() {
		livros.add(new Livro(1, 123456, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Rocco", 39.90));
		livros.add(new Livro(2, 124456, "Harry Potter e a Câmara Secreta", "J.K. Rowling", "Rocco", 39.90));
		livros.add(new Livro(3, 123340, "Harry Potter e o Prisioneiro de Azkaban", "J.K. Rowling", "Rocco", 42.90));
		livros.add(new Livro(4, 123000, "Harry Potter e o Cálice de Fogo", "J.K. Rowling", "Rocco", 44.90));
		livros.add(new Livro(5, 123999, "Harry Potter e a Ordem da Fênix", "J.K. Rowling", "Rocco", 47.90));
		livros.add(new Livro(1, 123994, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Rocco", 39.90));
		livros.add(new Livro(2, 124009, "Harry Potter e a Câmara Secreta", "J.K. Rowling", "Rocco", 39.90));
		livros.add(new Livro(3, 123959, "Harry Potter e o Prisioneiro de Azkaban", "J.K. Rowling", "Rocco", 42.90));
		livros.add(new Livro(4, 124009, "Harry Potter e o Cálice de Fogo", "J.K. Rowling", "Rocco", 44.90));
		livros.add(new Livro(5, 8942301, "Harry Potter e a Ordem da Fênix", "J.K. Rowling", "Rocco", 47.90));
		livros.add(new Livro(6, 5127834, "Harry Potter e o Enigma do Príncipe", "J.K. Rowling", "Rocco", 49.90));
		livros.add(new Livro(7, 6798452, "Harry Potter e as Relíquias da Morte", "J.K. Rowling", "Rocco", 52.90));
		livros.add(new Livro(8, 1432675, "O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", "Martins Fontes", 59.90));
		livros.add(new Livro(9, 9283567, "O Senhor dos Anéis: As Duas Torres", "J.R.R. Tolkien", "Martins Fontes", 59.90));
		livros.add(new Livro(10, 3614972, "O Senhor dos Anéis: O Retorno do Rei", "J.R.R. Tolkien", "Martins Fontes", 59.90));
		livros.add(new Livro(11, 7250368, "O Hobbit", "J.R.R. Tolkien", "Martins Fontes", 39.90));
		livros.add(new Livro(12, 2943851, "A Culpa é das Estrelas", "John Green", "Intrínseca", 34.90));
		livros.add(new Livro(13, 6138904, "A Menina que Roubava Livros", "Markus Zusak", "Intrínseca", 44.90));
		livros.add(new Livro(14, 8396472, "1984", "George Orwell", "Companhia das Letras", 34.90));
		livros.add(new Livro(15, 4015278, "A Revolução dos Bichos", "George Orwell", "Companhia das Letras", 29.90));
		livros.add(new Livro(16, 2678931, "Percy Jackson e o Ladrão de Raios", "Rick Riordan", "Intrínseca", 39.90));
		livros.add(new Livro(17, 5806243, "Percy Jackson e o Mar de Monstros", "Rick Riordan", "Intrínseca", 39.90));
		livros.add(new Livro(18, 7168492, "Percy Jackson e a Maldição do Titã", "Rick Riordan", "Intrínseca", 39.90));
		livros.add(new Livro(19, 9502137, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Geração Editorial", 24.90));
		livros.add(new Livro(20, 1347852, "A Metamorfose", "Franz Kafka", "Companhia das Letras", 19.90));
		}
	
	public static Livro adicionar(Livro livro) {
		livros.add(livro);
		return livro;
	}
	
	public static Livro getPorIsbn(int isbn) {
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getIsbn() == isbn) {
					return livro;
				}
			}
		}
		return null;
	}
	
	public static List<Livro> getPorAutor(String autor) {
		List<Livro> resultado = new ArrayList<>();
		
		for (Livro livro: livros) {
			if (livro.getAutor().equalsIgnoreCase(autor)) {
				resultado.add(livro);
			}
		}
		
		return resultado;
	}
	
	public static Livro getPorTitulo(String titulo) {
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					return livro;
				}
			}
		}
		return null;		
	}
	
	public static LivroDTO getPorIsbnDTO(int isbn) {
		LivroDTO livroDTO = null;
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getIsbn() == isbn) {
					livroDTO = 
						new LivroDTO(livro.getTitulo(),livro.getAutor(),livro.getEditora(),livro.getPreco());
					return livroDTO;
				}
			}
		}
		return livroDTO;
	}
	
	public static List<LivroDTO> getAllDTO() {
		List<LivroDTO> listaLivrosDTO = new ArrayList<>();
		if (livros != null) {
			for (Livro livro: livros) {
				LivroDTO livroDTO = 
						new LivroDTO(livro.getTitulo(),livro.getAutor(),livro.getEditora(),livro.getPreco());
				listaLivrosDTO.add(livroDTO);
			}
		}
		return listaLivrosDTO;
	}	
	
	public static void reajustarPrecoPorId(int id, double taxa) {
		if (livros != null) {
			for (Livro livro: livros) {
				if (livro.getId() == id) {
					livro.reajustarPreco(taxa);
				}
			}
		}
	}
	
	public static void reajustarPreco(double taxa) {
		if (livros != null) {
			for (Livro livro: livros) {
				livro.reajustarPreco(taxa);
			}
		}		
	}
	
	public static List<Livro> getAll() {
		return livros;
	}

	public static void setLivros(List<Livro> livros) {
		LivroDataSource.livros = livros;
	}
	
}
