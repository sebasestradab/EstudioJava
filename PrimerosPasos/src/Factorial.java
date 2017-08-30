//===============================
// Tutorial de Java YouTube
// CLASE: Factorial
// Video 22
//===============================
import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		Long resultado = 1L;
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for(int i=numero;i>0;i--){
			resultado = resultado*i;
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);
	}

}
