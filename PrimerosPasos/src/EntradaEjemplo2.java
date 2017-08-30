//===============================
// Tutorial de Java YouTube
// CLASE: EntradaEjemplo2
// Video 15
//===============================
import javax.swing.*;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		String nombre_usuario, edad;
		int edad_numero;
		
		nombre_usuario = JOptionPane.showInputDialog("Introdice tu nombre ");
		edad = JOptionPane.showInputDialog("Introduce la edad");
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (Integer.parseInt(edad) + 1) + " años.");
		
		edad_numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
		edad_numero++;
		System.out.println(edad_numero);
	}

}
