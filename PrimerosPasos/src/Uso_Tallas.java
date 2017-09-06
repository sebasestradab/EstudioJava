//=======================================
// Tutorial de Java YouTube
// CLASE: Uso_Tallas
// Video 48
// Titulo: Tipos Enumerados. Clase ENUM 
//=======================================
import java.util.Scanner;

public class Uso_Tallas {
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum Talla {
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private String abreviatura;
		
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String dameAbreviatura() {
			return abreviatura;
		}
	}
	
	public static void main(String[] args) {
		/*Talla s = Talla.MINI;
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.MUY_GRANDE;
		*/
		String entrada_datos;
		Talla la_talla;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE" );
		
		entrada_datos = entrada.next().toUpperCase();
		la_talla = Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla = " + la_talla);
		
		System.out.println("Abreviatura = " + la_talla.dameAbreviatura());
	}

}
