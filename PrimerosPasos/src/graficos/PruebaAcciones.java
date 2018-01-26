//==============================================
// Tutorial de Java YouTube
// CLASE: PruebaAcciones
// Video 76
// Tema: Eventos XII - Multiples Fuentes I
// Video 77
// Tema: Eventos XIII - Multiples Fuentes II
// Video 78
// Tema: Eventos XIV - Multiples Fuentes III
// Video 79
// Tema: Eventos XV - Multiples Fuentes IV
//==============================================
package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAccion mimarco = new MarcoAccion();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class MarcoAccion extends JFrame{
	public MarcoAccion() {
		setTitle("Prueba Acciones");
		setBounds(350,150,600,450);
		
		PanelAccion lamina = new PanelAccion();
		add(lamina);
		
//		JPanel g = new JPanel();
	}
}

class PanelAccion extends JPanel{
	public PanelAccion() {
		Accioncolor accionAmarillo = new Accioncolor("Amarillo", new ImageIcon("src/graficos/spain.png"), Color.YELLOW);
		Accioncolor accionAzul = new Accioncolor("Azul", new ImageIcon("src/graficos/colombia.png"), Color.BLUE);
		Accioncolor accionRojo = new Accioncolor("Rojo", new ImageIcon("src/graficos/brazil.png"), Color.RED);
		
		JButton botonAmarillo = new JButton(accionAmarillo);
		add(botonAmarillo);
		
		JButton botonAzul = new JButton(accionAzul);
		add(new JButton(accionAzul));
		
		JButton botonRojo = new JButton(accionRojo);
		add(botonRojo);
		
		/*JButton botonAmarillo = new JButton("Amarillo");
		JButton botonAzul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);*/
		
		// Crear mapa de entrada
//		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
//		InputMap mapaEntrada = getInputMap(JComponent.WHEN_FOCUSED);
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		
		// Representa la combinacion de teclas
		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		
		// Asignar combinacion de teclas a un objeto
		mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl C"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		
		// Asignar el objeto a la accion
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
	}

	private class Accioncolor extends AbstractAction{
		public Accioncolor(String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de colo " + nombre);
			putValue("color_de_fondo", color_boton);
		}
		
		// Metodo que se invoca inmediatamente se da el evento
		public void actionPerformed(ActionEvent e) {
			Color c = (Color) getValue("color_de_fondo");
			setBackground(c);
			
			System.out.println("Nombre: " + getValue(Action.NAME) + " Descripcion: " + getValue(Action.SHORT_DESCRIPTION));
		}
		
	}
}