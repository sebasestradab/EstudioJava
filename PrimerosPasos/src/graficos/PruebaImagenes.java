//==============================================
//Tutorial de Java YouTube
//CLASE: PruebaImagenes
//Video 63
//Tema: Swing IX Incluyendo imagenes.
//Video 64
//Tema: Swing X Incluyendo imagenes.
//==============================================

package graficos;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen mimarco = new MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame{
	public MarcoImagen() {
		LaminaConImagen milamina = new LaminaConImagen();
		
		try {
			Image icono = ImageIO.read(new File("src/graficos/icono.png"));
			setIconImage(icono);
			setTitle("Marco con Imagen");
			setBounds(750, 300, 300, 200); // Tamaño y posiciones de la ventana.
			add(milamina);
		}catch(IOException e){
			System.out.println("La imagen no se encuentra");
		}
	}
}

class LaminaConImagen extends JPanel{
	private Image imagen;
	
	public LaminaConImagen() {
		try {
			File miimaagen = new File("src/graficos/bola.jpg");
			imagen = ImageIO.read(miimaagen);
		}catch(IOException e){
			System.out.println("La imagen no se encuentra");
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
			
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0;i<300;i++) {
			for(int j=0;j<300;j++) {
				if(i+j > 0) {
					g.copyArea(0, 0, imagen.getWidth(this), imagen.getHeight(this), i*imagen.getWidth(this), j*imagen.getHeight(this));
				}
			}
		}
	}
}




