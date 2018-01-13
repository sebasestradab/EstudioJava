package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		
		boolean estalafuente = false;
		
		// Almacenar todos los tipos de fuentes instalados en la maquina
		String nombresDeFuentes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredelafuente:nombresDeFuentes) {
			//System.out.println(nombredelafuente);
			if(nombredelafuente.equalsIgnoreCase(fuente)) estalafuente = true;
		}
		
		if(estalafuente) {
			System.out.println("Fuente Instalada");
		}
		else{
			System.out.println("Fuente no Instalada");
		}
	}

}
