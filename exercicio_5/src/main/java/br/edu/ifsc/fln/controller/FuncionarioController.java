package br.edu.ifsc.fln.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {

    @RequestMapping(value="/funcionario")
    public List<Funcionario> getFuncionario() {
        return FuncionarioDataSource.getListaFuncionarios();
    }

    @RequestMapping("/criar_funcionario/{mt}/{nome}/{sb}/{nd}")
    public Funcionario criarFuncionario(
            @PathVariable("mt") int matricula,
            @PathVariable("nome") String nome,
            @PathVariable("sb") double salarioBase,
            @PathVariable("nd") int numeroDependentes) {

        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(matricula);
        funcionario.setNome(nome);
        funcionario.setSalarioBase(salarioBase);
        funcionario.setNumeroDependentes(numeroDependentes);
        FuncionarioDataSource.novo(funcionario);

        return funcionario;
    }

    @RequestMapping(value = "/calcular_salario/{matricula}/{nome}/{calcularIRPF}/{salarioBase}/{numeroDependentes}")
    public double calcularSalarioLiquido(
    		@PathVariable int matricula,
            @PathVariable String nome,
            @PathVariable double calcularIRPF,
            @PathVariable double salarioBase,
            @PathVariable int numeroDependentes) {

        double irpf = calcularIRPF(salarioBase);
        double salarioFamilia = calcularSalarioFamilia(numeroDependentes);

        return salarioBase - irpf + salarioFamilia;
    }

    private double calcularIRPF(double salarioBase) {
        if (salarioBase >= 8500.00) {
            return salarioBase * 0.275;
        } else if (salarioBase >= 5000.00) {
            return salarioBase * 0.15;
        } else {
            return 0.0;
        }
    }

    private double calcularSalarioFamilia(int numeroDependentes) {
        return 150.00 * numeroDependentes;
    }
}