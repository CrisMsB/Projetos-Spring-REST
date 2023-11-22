package br.edu.ifsc.segundoExercicio6;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private double salarioBruto;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int matricula, String nome, double salarioBruto) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double calcularSalarioLiquido() {
		
		return salarioBruto - calcularIrpf() - calcularInss();
	}
	
	private double calcularIrpf() {
		
		if (salarioBruto > 4664.68) return (salarioBruto * 0.275) - 869.36;
		else if (salarioBruto >=  3751.06) return (salarioBruto * 0.225) - 636.13;
		else if (salarioBruto >= 2826.66) return (salarioBruto * 0.15) - 354.80;
		else if (salarioBruto >= 1903.99) return (salarioBruto * 0.075) - 142.80;
		else return 0.0;
	}
	
	private double calcularInss() {
		if (salarioBruto > 6101.06) {
			return 6101.06 * 0.14;
		} else if (salarioBruto >= 3134.41) {
			return salarioBruto * 0.14;
		} else if (salarioBruto >= 2089.61) {
			return salarioBruto * 0.12;
		} else if (salarioBruto >= 1045.01) {
			return salarioBruto * 0.12;
		} else {
			return salarioBruto * 0.075;
		}
	}
	
	public FuncionarioDTO getFuncionarioDTO() {
		FuncionarioDTO funcionarioDTO = new FuncionarioDTO(
				this.getSalarioBruto(), this.calcularIrpf(),
				this.calcularInss(), this.calcularSalarioLiquido());
		return funcionarioDTO;
	}

	
	
	

}
