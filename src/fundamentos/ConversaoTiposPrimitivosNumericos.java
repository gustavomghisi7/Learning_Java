package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // impl�cita
		System.out.println(a);
		
		float b = (float) 1.123456789; // expl�cita
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.999;
		int f = (int) e; // expl�cita (CAST)
		System.out.println(f);

	}

}