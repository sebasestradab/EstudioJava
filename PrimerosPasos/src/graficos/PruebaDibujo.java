//==============================================
// Tutorial de Java YouTube
// CLASE: PruebaDibujo
// Video 59
// Tema: Interfaces de Usuario. Dibujando en el Frame.
//==============================================

package graficos;

import javax.swing.*;
import java.awt.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos mimarco = new MarcoConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConDibujos extends JFrame{
	public MarcoConDibujos() {
		setTitle("Prueba de Dibujo");
		setSize(400, 400);
		setLocationRelativeTo(null); // Centrar la ventana.
		
		LaminaConFiguras milamina = new LaminaConFiguras();
		add(milamina);
	}
}

class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 200, 200); // Dibujar Rectangulo
		g.drawLine(100, 100, 300, 200); // Dibuja una Linea
		g.drawArc(50, 100, 100, 200, 120, 150); // Dibujar Arco.
	}
}