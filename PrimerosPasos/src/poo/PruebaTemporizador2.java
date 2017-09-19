//==============================================
// Tutorial de Java YouTube
// CLASE: PruebaTemporizador2
// Video 53 - 54
// Tema: Interfaces y Clases internas Interfaces
//		 Clase Interna Local.
//==============================================

package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		Reloj mireloj = new Reloj();
		mireloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para continuar.");
		
		System.exit(0);
	}

}

class Reloj{
	//private int intervalo;
	//private boolean sonido;
	
	/*public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}*/
	
	public void enMarcha(int intervalo, final boolean sonido) {
		class DameLaHora2 implements ActionListener{
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 seg." + ahora);
				
				if(sonido) Toolkit.getDefaultToolkit().beep();
			}
		}
		
		ActionListener oyente = new DameLaHora2();
		Timer mitemportizador = new Timer(intervalo, oyente);
		
		mitemportizador.start();
	}
}