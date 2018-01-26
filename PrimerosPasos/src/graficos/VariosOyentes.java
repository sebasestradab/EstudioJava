//==============================================
// Tutorial de Java YouTube
// CLASE: VariosOyentes
// Video 80
// Tema: Eventos XVI - Multiples Oyentes
//==============================================
package graficos;

import java.awt.event.*;
import javax.swing.*;

public class VariosOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPrincipal mimarco = new MarcoPrincipal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MarcoPrincipal extends JFrame{
	public MarcoPrincipal() {
		setBounds(350,150,600,450);
		setTitle("Prueba Varios");
		
		LaminaPrincipal lamina = new LaminaPrincipal();
		add(lamina);
	}
}

class LaminaPrincipal extends JPanel{
	JButton botonCerrar;
	public LaminaPrincipal() {
		JButton botonNuevo = new JButton("Nuevo");
		botonCerrar = new JButton("Cerrar Todo");
		
		add(botonNuevo);
		add(botonCerrar);
		
		OyenteNuevo miOyente = new OyenteNuevo();
		botonNuevo.addActionListener(miOyente);
	}
	
	private class OyenteNuevo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			MarcoEmergente marco = new MarcoEmergente(botonCerrar);
			marco.setVisible(true);
			
		}
		
	}
}

class MarcoEmergente extends JFrame{
	private static int contador = 0;
	
	public MarcoEmergente(JButton boton_de_principal) {
		contador ++;
		setTitle("Ventana " + contador);
		setBounds(40 * contador, 40 * contador, 600, 450);
		
		CierraTodos oyenteCerrar = new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);
	}
	
	private class CierraTodos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// Cierra todas las ventanas
			dispose();
		}
		
	}
}
