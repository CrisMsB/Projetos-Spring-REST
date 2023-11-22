package br.edu.ifsc.fln.controller;

import java.util.List;
import java.util.ArrayList;

public class FuncionarioDataSource {
	 private static List<Funcionario> listaFuncionarios = new ArrayList<>();

	    public static void criarLista() {
	        Funcionario f1 = new Funcionario(1, "João", 1000.0, 2);
	        listaFuncionarios.add(f1);
	        listaFuncionarios.add(new Funcionario(2, "Maria", 1500.0, 1));
	    }

	    public static List<Funcionario> getListaFuncionarios() {
	        return listaFuncionarios;
	    }

	    public static void novo(Funcionario funcionario) {
	        listaFuncionarios.add(funcionario);
	    }

	    public static Funcionario getFuncionario(int Matricula) {
	        for (Funcionario f : listaFuncionarios) {
	            if (f.getMatricula() == Matricula) {
	                return f;
	            }
	        }
	        return null;
	    }
}
