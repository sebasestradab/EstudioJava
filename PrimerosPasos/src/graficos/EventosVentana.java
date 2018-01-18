//==============================================
// Tutorial de Java YouTube
// CLASE: EventosVentana
// Video 68
// Tema: IV Eentos
// Video 69
// Tema: V Eentos de Ventana II
//==============================================

package graficos;

import javax.swing.*;
import java.awt.event.*; // Contiene los clases e interfaces de eventos

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana mimarco = new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se cierra la aplicacion
		
		MarcoVentana mimarco2 = new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Solo se cierra esta ventana
		
		mimarco.setTitle("Ventana 1");
		mimarco.setBounds(100, 200, 500, 350);
		
		mimarco2.setTitle("Ventana 2");
		mimarco2.setBounds(700, 200, 500, 350);
		
	}

}

class MarcoVentana extends JFrame{
	public MarcoVentana() {
		//setTitle("Respondiendo");
		//setBounds(400, 200, 500, 350);
		setVisible(true);
		
//		M_Ventana oyente_ventana = new M_Ventana();

//		addWindowListener(oyente_ventana);
		
		addWindowListener(new M_Ventana());
	}
}

// Clase 68
/*class M_Ventana implements WindowListener{
	
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana Activada");
	}
	
	public void windowClosed(WindowEvent e) {
		System.out.println("La Ventana ha sido Cerrada");
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando Ventana");
	}
	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana Desactivada");
	}
	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana restaurada");
	}
	
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
	
	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana Abierta");
	}
}*/

//Clase 68
class M_Ventana extends WindowAdapter{
	
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
	
}

