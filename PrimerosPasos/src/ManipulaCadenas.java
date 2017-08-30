//===============================
// Tutorial de Java YouTube
// CLASE: ManipulaCadenas
// Video 11
//===============================

public class ManipulaCadenas {

	public static void main(String[] args) {
		String nombre = "Sebastian";
		
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		System.out.println("La primera de mi nombre es " + nombre.charAt(0));
		
		int ultima_letra;
		ultima_letra = nombre.length();
		System.out.println("La ultima letra es " + nombre.charAt(ultima_letra-1));
	}

}
