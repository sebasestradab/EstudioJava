//===============================
// Tutorial de Java YouTube
// CLASE: EntradaEjemplo1
// Video 14
//===============================

import java.util.Scanner;

public class EntradaEjemplo1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre_usuario;
		int edad;
		
		System.out.println("Introduce tu nombre: ");
		nombre_usuario = entrada.nextLine();
		
		System.out.println("Introduce edad: ");
		edad = entrada.nextInt() + 1;
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + edad + " años");
	}

}
