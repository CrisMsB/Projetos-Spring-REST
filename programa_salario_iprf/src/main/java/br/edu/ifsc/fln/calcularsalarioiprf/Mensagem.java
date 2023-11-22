package br.edu.ifsc.fln.calcularsalarioiprf;

public class Mensagem {

    private String nome;
    private double salarioBase;
    private int numeroDependentes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public Mensagem(String nome, double salarioBase, int numeroDependentes) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.numeroDependentes = numeroDependentes;
    }
}

