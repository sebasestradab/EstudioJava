//===============================
// Tutorial de Java YouTube
// CLASE: EntradaNumeros
// Video 15
//===============================
import javax.swing.*;

public class EntradaNumeros {

	public static void main(String[] args) {
		double x = 10000.0;
		System.out.printf("%1.4f", x/3); // Imprimir con formato
		
		String num1 = JOptionPane.showInputDialog("Introduce un número");
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.4f", Math.sqrt(num2));
	}

}
