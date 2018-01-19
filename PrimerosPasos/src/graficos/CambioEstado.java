//==============================================
// Tutorial de Java YouTube
// CLASE: CambioEstado
// Video 70
// Tema: Eventos VI - Eventos de ventana III
//==============================================
package graficos;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado mimarco = new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEstado extends JFrame{
	public MarcoEstado() {
		setVisible(true);
		setBounds(350,200,500,350);
		
		addWindowStateListener(new CambiaEstado());
	}
}

class CambiaEstado implements WindowStateListener{
	public void windowStateChanged(WindowEvent e) {
		//System.out.println("La ventana ha cambiado de estado");
		
		System.out.println(e.getNewState());
		
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana esta a pantalla completa");
		}else if(e.getNewState() == Frame.NORMAL) {
			System.out.println("La ventana esta normal");
		}else if(e.getNewState() == Frame.ICONIFIED) {
			System.out.println("La ventana esta minimizada");
		}
	}
}
