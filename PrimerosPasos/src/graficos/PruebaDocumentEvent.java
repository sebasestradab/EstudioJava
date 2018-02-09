//=========================================================
// Tutorial de Java YouTube
// CLASE: PruebaTexto
// Video 88
// Tema: Componentes Swing - Eventos en Cuadros de Texto I
//=========================================================
package graficos;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.Document;

public class PruebaDocumentEvent {

	public static void main(String[] args) {
		MarcoPrueba mimarco = new MarcoPrueba();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoPrueba extends JFrame{
	public MarcoPrueba() {
		setBounds(400,100,450,300);
		
		LaminaPrueba milamina = new LaminaPrueba();
		add(milamina);
		setVisible(true);
	}
}

class LaminaPrueba extends JPanel{
	public LaminaPrueba() {
		JTextField micampo = new JTextField(20);
		EscuchaTexto elEvento = new EscuchaTexto();
		
		Document midoc = micampo.getDocument();
		
		add(micampo);
		
		midoc.addDocumentListener(elEvento);
	}
	
	private class EscuchaTexto implements DocumentListener{
		public void changedUpdate(DocumentEvent e) {
			
		}

		public void insertUpdate(DocumentEvent e) {
			System.out.println("Has insertado texto");
		}

		public void removeUpdate(DocumentEvent e) {
			System.out.println("Has borrado texto");
		}
		
	}
}