//===============================
// Tutorial de Java YouTube
// CLASE: CalculosMath
// Video 9 - 10
//===============================

public class CalculosMath {

	public static void main(String[] args) {
		double raiz = Math.sqrt(9);
		double num1 = 5.85;
		
		int resultado = (int) Math.round(num1);
		
		System.out.println(resultado);
		
		double base = 5;
		double exponente = 3;
		
		resultado = (int) Math.pow(base, exponente);
		System.out.println("El resultado de " + (int)base + " elevado a " + exponente + " es " + resultado);
		
	}

}
