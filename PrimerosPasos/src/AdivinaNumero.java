//===============================
// Tutorial de Java YouTube
// CLASE: AdivinaNumero
// Video 19
//===============================
import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		int aleatorio, numero, intentos;
		Scanner entrada = new Scanner(System.in);
		
		numero = 0;
		intentos = 0;
		aleatorio = (int) (Math.random() * 100);
		
		while(numero != aleatorio){
			System.out.println("Introduce un numero por favor");
			numero = entrada.nextInt();
			
			if(aleatorio < numero){
				System.out.println("Mas bajo");
			}else if(aleatorio > numero){
				System.out.println("Mas alto");
			}
			
			intentos++;
		}
		
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
	}

}
