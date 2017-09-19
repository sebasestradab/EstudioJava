//==============================================
// Tutorial de Java YouTube
// CLASE: CreandoMarcos
// Video 57
// Tema: Interfaces de usuario.
//==============================================
package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
		
	}

}


class MarcoCentrado extends JFrame{
	public MarcoCentrado() {
		int alturaPantalla, anchoPantalla;
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension tamano = mipantalla.getScreenSize();
		
		alturaPantalla = tamano.height;
		anchoPantalla = tamano.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		//setLocation(anchoPantalla/4, alturaPantalla/4);
		setLocationRelativeTo(null); // Centrar la ventana.
		
		setTitle("MarcoCentrado");
		
		Image miIcono = mipantalla.getImage("src/graficos/icono.png");
		setIconImage(miIcono);
	}
}