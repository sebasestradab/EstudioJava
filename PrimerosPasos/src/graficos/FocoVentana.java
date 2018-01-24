//==============================================
// Tutorial de Java YouTube
// CLASE: FocoEvento
// Video 75
// Tema: Eventos XI - Eventos de foco II
//==============================================

package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

public class FocoVentana extends JFrame implements WindowFocusListener{
	FocoVentana marco1, marco2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FocoVentana miv = new FocoVentana();
		miv.iniciar();
	}
	
	public void iniciar() {
		marco1 = new FocoVentana();
		marco2 = new FocoVentana();
		
		marco1.setVisible(true);
		marco2.setVisible(true);
		
		marco1.setBounds(100, 100, 600, 350);
		marco2.setBounds(700, 100, 600, 350);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	}
	
	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == marco1) {
			marco1.setTitle("Tengo el foco!!");
		}else {
			marco2.setTitle("Tengo el foco!!");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == marco1) {
			marco1.setTitle("No Tengo el foco!!");
		}else {
			marco2.setTitle("No Tengo el foco!!");
		}
	}

}
