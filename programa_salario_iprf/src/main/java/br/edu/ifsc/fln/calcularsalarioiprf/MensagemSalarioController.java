package br.edu.ifsc.fln.calcularsalarioiprf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class MensagemSalarioController {
	
	@RestController
	public class EmployeeController {

	    @GetMapping("/calcular_salario/{nome}/{salarioBase}/{numeroDependentes}")
	    public double calcularSalarioLiquido(
	            @PathVariable String nome,
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
}