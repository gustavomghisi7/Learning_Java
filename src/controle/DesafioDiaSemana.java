package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Dia 1 da semana");
		} else if(dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Dia 2 da semana");
		} else if(dia.equalsIgnoreCase("Terça")) {
			System.out.println("Dia 3 da semana");
		} else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Dia 4 da semana");
		} else if(dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Dia 5 da semana");
		} else if(dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Dia 6 da semana");
		} else if(dia.equalsIgnoreCase("Sabado")) {
			System.out.println("Dia 7 da semana");
		} else {
			System.out.println("Dia inválido");
		}
		
		entrada.close();

	}

}
