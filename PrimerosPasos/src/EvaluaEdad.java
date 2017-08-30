//===============================
// Tutorial de Java YouTube
// CLASE: EvaluaEdad
// Video 16
//===============================
import java.util.*;

public class EvaluaEdad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad;
		
		System.out.println("Introduce tu edad: ");
		edad = entrada.nextInt();
		
		if(edad >= 18){
			System.out.println("Eres mayor de edad");
		}else{
			System.out.println("Eres menor de edad");
		}
		
		if(edad < 18){
			System.out.println("Eres un adolescente");
		}else if(edad < 65){
			System.out.println("Eres maduro");
		}else{
			System.out.println("Cuidate");
		}
	}

}
