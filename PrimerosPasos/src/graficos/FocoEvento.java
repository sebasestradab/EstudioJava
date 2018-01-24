//==============================================
// Tutorial de Java YouTube
// CLASE: FocoEvento
// Video 74
// Tema: Eventos X - Eventos de foco I
// Video 75
// Tema: Eventos XI - Eventos de foco II
//==============================================

package graficos;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco mimarco = new MarcoFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame{
	public MarcoFoco() {
		setVisible(true);
		setBounds(350,150,600,450);
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel{
	JTextField cuadro1, cuadro2;
	JLabel label1;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		label1 = new JLabel();
		
		// Invalidar el layout. Colcoar los elementos donde se desee y que Java no los organice a su antojo
		setLayout(null);
		
		cuadro1.setBounds(120, 10, 150, 20);
		label1.setBounds(290, 10, 150, 20);
		
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		add(label1);
		add(cuadro2);	
		
		LanzaFocos elFcoco = new LanzaFocos();
		cuadro1.addFocusListener(elFcoco);
	}

	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
//			System.out.println("He perdido el foco.");
			String email = cuadro1.getText();
			boolean comprobacion = false;
			
//			label1.setText("");
			
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i) == '@') {
					comprobacion = true;
				}
			}
			
			if (comprobacion) {
				System.out.println("Correcto");
//				label1.setText("Correcto");
			}else {
				System.out.println("Incorrecto");
//				label1.setText("Incorrecto");
			}
		}
		
	}
}

