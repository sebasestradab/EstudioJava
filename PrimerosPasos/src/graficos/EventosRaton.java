//==============================================
// Tutorial de Java YouTube
// CLASE: EventosRaton
// Video 72
// Tema: Eventos VIII - Eventos de raton I
// Video 72
// Tema: Eventos IX - Eventos de raton II
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
//		addMouseListener(new EventosDeRaton());
		addMouseMotionListener(new EventosDeRaton());
	}
}

//class EventosDeRaton implements MouseListener{
//class EventosDeRaton extends MouseAdapter{
//	public void mousePressed(MouseEvent e) {
//		System.out.println(e.getModifiersEx());
//		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
//			System.out.println("Has pulsado el botón izquierdo.");
//		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
//			System.out.println("Has pulsado la rueda del ratón.");
//		}else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
//			System.out.println("Has pulsado el botón derecho.");
//		}
//	}
	
	
//	@Override
//	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("Has hecho click");
//		System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY()); Funciones que dan las coordenadas del mouse
//		System.out.println(e.getClickCount()); Retorna el numero de clocks
//	}

//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("Acabas de entrar");
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("Acabas de salir");
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("Acabas de presionar");
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("Acabas de levantar");
//	}
	
//}

class EventosDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando " + e.getX());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo " + e.getX());
	}
	
}
