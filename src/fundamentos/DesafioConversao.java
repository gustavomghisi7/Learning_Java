package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário: ");
		Double sal1 = Double.parseDouble(salario.next().replace(",", "."));
		
		System.out.println("Informe o segundo salário: ");
		Double sal2 = Double.parseDouble(salario.next().replace(",", "."));
		
		System.out.println("Informe o terceiro salário: ");
		Double sal3 = Double.parseDouble(salario.next().replace(",", "."));
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.println("Média do salário é " + media);
		
		salario.close();

	}

}
