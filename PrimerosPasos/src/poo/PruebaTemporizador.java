//==============================================
// Tutorial de Java YouTube
// CLASE: PruebaTemporizador
// Video 52
// Tema: Interfaces y Clases internas Interfaces
//==============================================

package poo;

import javax.swing.*;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		DameLaHora oyente = new DameLaHora(); // ActionListener oyente = new DameLaHora()
		Timer mitemporizador = new Timer(5000, oyente);
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		
		System.exit(0); // Detener la ejecucion del programa.
	}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 5 seg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}
