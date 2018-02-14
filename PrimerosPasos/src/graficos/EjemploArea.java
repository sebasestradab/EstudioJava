//=========================================================
// Tutorial de Java YouTube
// CLASE: EjemploArea
// Video 90
// Tema: Componentes Swing - Areas de Texto I
//=========================================================

package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoArea mimarco = new MarcoArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoArea extends JFrame{
	public MarcoArea() {
		setBounds(400,100,450,300);
		LaminaArea milamina = new LaminaArea();
		
		add(milamina);
		setVisible(true);
	}
}

class LaminaArea extends JPanel{
	private JTextArea miarea;
	public LaminaArea() {
		miarea = new JTextArea(8, 20);
		JScrollPane laminaBarras = new JScrollPane(miarea); // Panel con barras de desplazamiento
		
//		miarea.setLineWrap(true); // Definir saltos de linea para que no se ensanche solo
		add(laminaBarras);
		
		JButton miboton = new JButton("Dale");
		miboton.addActionListener(new GestionaArea());
		
		add(miboton);
	}
	
	private class GestionaArea implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(miarea.getText());
		}
		
	}
}
