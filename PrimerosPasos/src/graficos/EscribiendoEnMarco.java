//==============================================
// Tutorial de Java YouTube
// CLASE: EscribiendoEnMarco
// Video 58
// Tema: Interfaces de Usuario. Escribiendo en el Frame.
//==============================================

package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		MarcoConTexto mimarco = new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoConTexto extends JFrame{
	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocationRelativeTo(null); // Centrar la ventana.
		setTitle("Primer Texto");
		
		Lamina milamina = new Lamina();
		add(milamina);
	}
}

class Lamina extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}