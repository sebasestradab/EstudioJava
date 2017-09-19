//==============================================
// Tutorial de Java YouTube
// CLASE: CreandoMarcos
// Video 55 - 56
// Tema: Aplicaciones Graficas.
//==============================================

package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		miMarco marco1 = new miMarco();
		
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se cierra el programa y no queda en ejecucion.

	}

}

class miMarco extends JFrame{
	public miMarco() {
		//setSize(500, 300); // Tamaño de Width y Height. Tamaño de la ventana.
		//setLocation(430,200); // Ubicar en x,y la ventana.
		
		setBounds(430, 200, 550, 250); // Tamaño y posicion de la ventana.
		//setResizable(false); // Permitir que se pueda redimensionar al ventana.
		
		//setExtendedState(Frame.MAXIMIZED_BOTH); // Abrir la ventana totalmente maximizada.
		
		setTitle("Mi ventana"); // Titulo de la ventana.
	}
}
