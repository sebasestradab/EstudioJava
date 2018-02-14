//=========================================================
// Tutorial de Java YouTube
// CLASE: PruebaArea
// Video 91
// Tema: Componentes Swing - Areas de Texto II
//=========================================================
package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class MarcoPruebaArea extends JFrame{
	private JPanel laminaBotones;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
	
	public MarcoPruebaArea() {
		setBounds(400,100,450,300);
		setTitle("Probando Area de Texto");
		
		setLayout(new BorderLayout());
		laminaBotones = new JPanel();
		botonInsertar = new JButton("Insertar");
		botonSaltoLinea = new JButton("Salto Linea");
		
		botonInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme...");
			}
			
		});
		
		laminaBotones.add(botonInsertar);
		
		botonSaltoLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean saltar =! areaTexto.getLineWrap(); // Saber si hay salto de linea
				
				areaTexto.setLineWrap(saltar); // Agregar salto de linea
				
//				if(saltar) {
//					botonSaltoLinea.setText("Quitar salto");
//				}else {
//					botonSaltoLinea.setText("Salto Linea");
//				}
				
				// Operador ternario
				botonSaltoLinea.setText(saltar == true ? "Quitar Salto" : "Salto Linea");
			}
			
		});
		
		laminaBotones.add(botonSaltoLinea);
		add(laminaBotones, BorderLayout.SOUTH);
		
		areaTexto = new JTextArea(8, 20);
		laminaConBarras = new JScrollPane(areaTexto);
		
		add(laminaConBarras, BorderLayout.CENTER);
	}
}