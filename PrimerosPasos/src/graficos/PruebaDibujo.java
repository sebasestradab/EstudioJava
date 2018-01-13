//==============================================
// Tutorial de Java YouTube
// CLASE: PruebaDibujo
// Video 59 - 60 - 61
// Tema: Interfaces de Usuario. Dibujando en el Frame.
//==============================================

package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

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
		
		milamina.setBackground(SystemColor.window);
	}
}

class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawRect(50, 50, 200, 200); // Dibujar Rectangulo
		//g.drawLine(100, 100, 300, 200); // Dibuja una Linea
		//g.drawArc(50, 100, 100, 200, 120, 150); // Dibujar Arco.
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.DARK_GRAY);
		g2.draw(rectangulo);
		
		g2.setPaint(Color.RED);
		
		//g2.draw(rectangulo);
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		
		Color micolor = new Color(125, 189, 200);
		
		//g2.setPaint(new Color(209, 204, 14).darker().darker());
		g2.setPaint(micolor);
		
		//g2.draw(elipse);
		g2.fill(elipse);
		
		/*
		Line2D Linea = new Line2D.Double(100, 100, 300, 250);
		g2.draw(Linea);
		
		double CentroenX = rectangulo.getCenterX();
		double CentroenY = rectangulo.getCenterY();
		
		double radio = 150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX + radio, CentroenY + radio);
		
		g2.draw(circulo);*/
	}
}