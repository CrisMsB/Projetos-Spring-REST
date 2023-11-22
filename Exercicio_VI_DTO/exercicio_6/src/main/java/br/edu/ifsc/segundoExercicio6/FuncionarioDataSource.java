package br.edu.ifsc.segundoExercicio6;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {
	
private static List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	public static void criarLista() {
		listaFuncionarios.add(new Funcionario(1, "Bertrudez", 4000.0));
		listaFuncionarios.add(new Funcionario(2, "Alibaba", 2400.0));
		listaFuncionarios.add(new Funcionario(3, "Suzane Vonristofem", 14000.0));
		listaFuncionarios.add(new Funcionario(4, "Paulinho Loco", 2600.0));
	}

	public static List<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public static void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		FuncionarioDataSource.listaFuncionarios = listaFuncionarios;
	}
	
	public static void add(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
	}
	
	public static Funcionario getPorMatricula(int matricula) {
		for (Funcionario funcionario: listaFuncionarios) {
			if (funcionario.getMatricula() == matricula) {
				return funcionario;
			}
		}
		return null;
	}

}
