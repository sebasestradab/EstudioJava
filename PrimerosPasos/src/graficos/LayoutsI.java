//==============================================
// Tutorial de Java YouTube
// CLASE: LayoutsI
// Video 81
// Tema: Layouts I
// Video 82
// Tema: Layouts II
//==============================================

package graficos;

import java.awt.*;
import javax.swing.*;

public class LayoutsI {
	protected static final int FLOW_LAYOUTH = 1;
	protected static final int BORDER_LAYOUTH = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLayout marco1 = new MarcoLayout(FLOW_LAYOUTH);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setVisible(true);
		
		MarcoLayout marco2 = new MarcoLayout(BORDER_LAYOUTH);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setVisible(true);
		
		MarcoLayout marco3 = new MarcoLayout(3);
		marco3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco3.setVisible(true);
	}

}

class MarcoLayout extends JFrame{
	public MarcoLayout(int tipoLayout){
		PanelLayout lamina = new PanelLayout(tipoLayout);
		
		
		if(tipoLayout == LayoutsI.FLOW_LAYOUTH) {
			setTitle("Prueba Acciones - FlowLayout");
			setBounds(0,5,400,300);
			add(lamina);
		}else if(tipoLayout == LayoutsI.BORDER_LAYOUTH){
			setTitle("Prueba Acciones - BorderLayout");
			setBounds(400,5,400,300);
			add(lamina);
		}else {
			setTitle("Prueba Acciones - Combinacion");
			setBounds(800,5,400,300);
			PanelLayout2 lamina2 = new PanelLayout2();
			add(lamina, BorderLayout.NORTH);
			add(lamina2, BorderLayout.SOUTH);
		}
		
//		FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT, 75, 100);
//		lamina.setLayout(new FlowLayout(FlowLayout.LEFT, 75, 100));
		
	}
}

class PanelLayout extends JPanel{	
	public PanelLayout(int tipoLayout) {
		if(tipoLayout == LayoutsI.FLOW_LAYOUTH) {
			setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
			add(new JButton("Amarillo"));
			add(new JButton("Rojo"));
			add(new JButton("Azul"));
		}else if(tipoLayout == LayoutsI.BORDER_LAYOUTH){
			setLayout(new BorderLayout(10,10));
			
			add(new JButton("Amarillo"), BorderLayout.NORTH);
			add(new JButton("Rojo"), BorderLayout.SOUTH);
			add(new JButton("Azul"), BorderLayout.WEST);
			add(new JButton("Verde"), BorderLayout.EAST);
			add(new JButton("Negro"), BorderLayout.CENTER);
		}else {
			setLayout(new FlowLayout(FlowLayout.LEFT));
			add(new JButton("Amarillo"));
			add(new JButton("Rojo"));
		}
	}
}

class PanelLayout2 extends JPanel{
	public PanelLayout2() {
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER);
	}
}