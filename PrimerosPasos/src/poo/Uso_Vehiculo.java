//===============================
// Tutorial de Java YouTube
// CLASE: Uso_Coche
// Video 28-29-30-31-32-41
//===============================
package poo;

//import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		Coche micoche1 = new Coche();
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
				
		micoche1.establece_color("Rojo");
		
		//mifurgoneta1.establece_color("Azul");
		//mifurgoneta1.configura_asientos("Si");
		//mifurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
		System.out.println(mifurgoneta1.dime_datos_generales() + " " + mifurgoneta1.dimeDatosFurgoneta());
		
		///// Borrado ////////////////
		/*Coche micoche = new Coche(); // Instanciar una clase - Renault: Ejemplar de Clase
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
				
		micoche.establece_color(JOptionPane.showInputDialog("Introduce el color"));
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es " + micoche.precio_coche());*/
		
	}

}
