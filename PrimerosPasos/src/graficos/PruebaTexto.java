//==============================================
// Tutorial de Java YouTube
// CLASE: PruebaTexto
// Video 86
// Tema: Componentes Swing - Cuadros de Texto I
// Video 87
// Tema: Componentes Swing - Cuadros de Texto II
//==============================================
package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto mimarco = new MarcoTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setBounds(400,100,450,300);
		LaminaTexto milamina = new LaminaTexto();
		add(milamina);
		setVisible(true);
	}
}

class LaminaTexto extends JPanel{
	private JTextField campo1 = new JTextField(20);
	private JLabel resultado;
	
	public LaminaTexto() {
		setLayout(new BorderLayout());
		JPanel milamina2 = new JPanel();
		
		milamina2.setLayout(new FlowLayout());
		resultado = new JLabel("", JLabel.CENTER);
		JLabel texto1 = new JLabel("Email:");
		JButton miboton = new JButton("Comprobar");
		
		DameTexto mievento = new DameTexto();
		miboton.addActionListener(mievento);
		
		add(resultado, BorderLayout.CENTER);
		
		milamina2.add(texto1);
		milamina2.add(campo1);
		milamina2.add(miboton);
		
		add(milamina2, BorderLayout.NORTH);
	}
	
	private class DameTexto implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int correcto = 0;
			String email = campo1.getText().trim();
			
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i) == '@') correcto++;
			}
			
			if(correcto != 1) {
//				System.out.println("Incorrecto");
				resultado.setText("Incorrecto");
			}else {
//				System.out.println("Correcto");
				resultado.setText("Correcto");
			}
			
		}
		
	}
}
