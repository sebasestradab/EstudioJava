//==============================================
//Tutorial de Java YouTube
//CLASE: PruebaEventos
//Video 65
//Tema: Eventos I.
//Video 66
//Tema: Eventos II.
//Video 67
//Tema: Eventos III.
//==============================================
package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones mimarco = new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBotones extends JFrame{
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(400, 200, 500, 300);
		
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);
	}
}

// Clase Video 66
/*class LaminaBotones extends JPanel implements ActionListener{
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones(){
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		// ActionListener: Evento de mouse
		botonAzul.addActionListener(this); // Objeto Evento: Action = Al hacer click
										   // Objeto Fuente: Boton Azul = Desencadena el evento
										   // Objeto This(Propia Clase): Listener = Oyente
		
		botonAmarillo.addActionListener(this);
		
		botonRojo.addActionListener(this);
	}
	
	// Pertenece a la interfaz ActionListener
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource(); // Obtiene el objeto que llamo el metodo
		
		if(botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		}
		else if(botonPulsado == botonAmarillo){
			setBackground(Color.YELLOW);
		}else {
			setBackground(Color.RED);
		}
	}
}*/

//Clase Video 67
class LaminaBotones extends JPanel{
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones(){
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		// ActionListener: Evento de mouse
		botonAzul.addActionListener(Azul); // Objeto Evento: Action = Al hacer click
										   // Objeto Fuente: Boton Azul = Desencadena el evento
										   // Objeto This(Propia Clase): Listener = Oyente
		
		botonAmarillo.addActionListener(Amarillo);
		
		botonRojo.addActionListener(Rojo);
	}
	
	private class ColorFondo implements ActionListener{
		private Color colorDeFondo;
		
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}
	}
}
