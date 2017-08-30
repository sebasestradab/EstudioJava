//===============================
// Tutorial de Java YouTube
// CLASE: Areas
// Video 17
//===============================
import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int figura, lado, base, altura, radio;
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectanglo \n3: Triangulo \n4: Circulo");
		figura = entrada.nextInt();
		
		switch(figura){
			case 1:
				lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
				System.out.println("El area del cuadrado es :" + Math.pow(lado, 2));
				break;
				
			case 2:
				base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
				altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
				System.out.println("El area del rectangulo es :" + (base*altura));
				break;
				
			case 3:
				base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
				altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
				System.out.println("El area del triangulo es :" + ((base*altura)/2));
				break;
				
			case 4:
				radio = Integer.parseInt(JOptionPane.showInputDialog("introduce la radio"));
				System.out.print("El area del circulo es :");
				System.out.printf("%1.2f", (Math.PI * Math.pow(radio, 2)));
				break;
			
			default:
				System.out.println("La opción no es correcta");
				break;
		}
	}

}
