//==============================================
// Tutorial de Java YouTube
// CLASE: EventosRaton
// Video 72
// Tema: Eventos VIII - Eventos de raton I
//==============================================
package graficos;

import java.awt.event.*;
import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton mimarco = new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setVisible(true);
		setBounds(350,150,600,450);
		addMouseListener(new EventosDeRaton());
	}
}

//class EventosDeRaton implements MouseListener{
class EventosDeRaton extends MouseAdapter{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Has hecho click");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de entrar");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de salir");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de levantar");
	}
	
}
