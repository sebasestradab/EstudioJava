//=========================================================
// Tutorial de Java YouTube
// CLASE: CamposPassword
// Video 89
// Tema: Componentes Swing - Eventos en Cuadros de Texto II
//=========================================================

package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class CamposPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPassword mimarco = new MarcoPassword();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoPassword extends JFrame{
	public MarcoPassword() {
		setBounds(400,100,450,300);
		
		LaminaPassword milamina = new LaminaPassword();
		add(milamina);
		
		setVisible(true);
	}
}


class LaminaPassword extends JPanel{
	JPasswordField c_contra;
	
	public LaminaPassword() {
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior = new JPanel();
		laminaSuperior.setLayout(new GridLayout(2, 2));
		
		add(laminaSuperior, BorderLayout.NORTH);
		
		JLabel etiqueta1 = new JLabel("Usuario");
		JLabel etiqueta2 = new JLabel("Contraseña");
		
		JTextField c_usuario = new JTextField(15);
		c_contra = new JPasswordField(15);
		
		CompruebaPass mievento = new CompruebaPass();
		c_contra.getDocument().addDocumentListener(mievento);
		
		JButton enviar = new JButton("Enviar");
		
		laminaSuperior.add(etiqueta1);
		laminaSuperior.add(c_usuario);
		
		laminaSuperior.add(etiqueta2);
		laminaSuperior.add(c_contra);
		
		add(enviar, BorderLayout.SOUTH);
	}
	
	private class CompruebaPass implements DocumentListener{

		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char contrasena[];
			
			contrasena = c_contra.getPassword();
			if(contrasena.length < 8 || contrasena.length > 12) {
				c_contra.setBackground(Color.RED);
			}else {
				c_contra.setBackground(Color.WHITE);
			}
		}

		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char contrasena[];
			
			contrasena = c_contra.getPassword();
			if(contrasena.length < 8 || contrasena.length > 12) {
				c_contra.setBackground(Color.RED);
			}else {
				c_contra.setBackground(Color.WHITE);
			}
		}
		
	}
}
