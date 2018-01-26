//==============================================
// Tutorial de Java YouTube
// CLASE: Calculadora
// Video 83
// Tema: Layouts III
// Video 84
// Tema: Layouts IV
//==============================================
package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCalculadora mimarco = new MarcoCalculadora();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoCalculadora extends JFrame{
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(400,100,450,300);
		add(new LaminaCalculadora());
//		pack(); // El contenedor se adapta al tamaño de el objeto que contiene
	}
}

class LaminaCalculadora extends JPanel{
	private JPanel milamina2;
	private JButton pantalla;
	private boolean principio;
	
	public LaminaCalculadora() {
		principio = true;
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		pantalla.setEnabled(false);
		pantalla.setBackground(Color.LIGHT_GRAY);
		add(pantalla, BorderLayout.NORTH);
		
		milamina2 = new JPanel();
		milamina2.setLayout(new GridLayout(4, 4, 1, 1));
		
//		JButton boton1 = new JButton("1");
//		milamina2.add(boton1);
//		JButton boton2 = new JButton("2");
//		milamina2.add(boton2);
//		JButton boton3 = new JButton("3");
//		milamina2.add(boton3);
//		
//		JButton boton4 = new JButton("4");
//		milamina2.add(boton4);
		
		ponerBoton("7");
		ponerBoton("8");
		ponerBoton("9");
		ponerBoton("/");
		
		ponerBoton("4");
		ponerBoton("5");
		ponerBoton("6");
		ponerBoton("*");
		
		ponerBoton("1");
		ponerBoton("2");
		ponerBoton("3");
		ponerBoton("-");
		
		ponerBoton("0");
		ponerBoton(".");
		ponerBoton("=");
		ponerBoton("+");
		
		add(milamina2, BorderLayout.CENTER);
	}
	
	private void ponerBoton(String rotulo) {
		JButton boton = new JButton(rotulo);
		InsertaNumero panel = new InsertaNumero();
		boton.addActionListener(panel);
		boton.addKeyListener(panel);
		milamina2.add(boton);
	}
	
	private class InsertaNumero implements ActionListener, KeyListener{
		public void actionPerformed(ActionEvent e) {
			String entrada = e.getActionCommand(); // Retorna el texto del boton pulsado
			
			if(principio) {
				pantalla.setText("");
				principio = false;
			}
			
//			if(entrada != "/") {
				if(pantalla.getText() == "0") {
					pantalla.setText(entrada);
				}else {
					pantalla.setText(pantalla.getText() + entrada);
				}
//			}
		}

		public void keyPressed(KeyEvent e) {
			char entrada = e.getKeyChar(); // Retorna el texto del boton pulsado
			
			if(principio) {
				pantalla.setText("");
				principio = false;
			}
			
			// Si se digita una letra retorna y no se muestra
			if(!Character.isDigit(entrada)) return;
			
			if(pantalla.getText() == "0") {
				pantalla.setText(Character.toString(entrada));
			}else {
				pantalla.setText(pantalla.getText() + entrada);
			}
		}

		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
		
	}
}