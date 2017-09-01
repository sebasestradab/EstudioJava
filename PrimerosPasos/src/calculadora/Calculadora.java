package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma, valor1, valor2;
		
		try {
			valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 1"));
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 2"));
			
			suma = suma(valor1, valor2);
			System.out.println(suma);
			
		}catch(NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
			return;
		}
	}
	
	public static int suma(int valor1, int valor2) {
		int valorSuma = 0;
		
		valorSuma = valor1 + valor2;
		
		return valorSuma;
	}
	
	public void restar(int valor1, int valor2) {
		int valorResta = 0;
		
		valorResta = valor1 - valor2;
	}
	
	public double dividir(int valor1, int valor2) {
		double valorDivision = 0;
		
		try {
			valorDivision = valor1 / valor2;
			
			return valorDivision;
		}catch(ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
			return 0;
		}
	}

}
