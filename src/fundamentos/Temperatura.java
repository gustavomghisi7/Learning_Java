package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double grausFahrenheit = 86;
		double resultado = (grausFahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + resultado + "C");
		
		
		grausFahrenheit = 0;
		resultado = (grausFahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + resultado + "C");
 
	}

}
