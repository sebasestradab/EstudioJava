//===============================
// Tutorial de Java YouTube
// CLASE: PesoIdeal
// Video 20
//===============================
import javax.swing.*;

public class PesoIdeal {

	public static void main(String[] args) {
		String genero;
		int altura, pesoideal;
		
		do{
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		} while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		
		altura = Integer.parseInt(JOptionPane.showInputDialog("introduce altura en cm"));
		
		if(genero.equalsIgnoreCase("H")){
			pesoideal = altura - 110;
		}else{
			pesoideal = altura - 120;
		}
		
		System.out.println("Tu peso idela es " + pesoideal + "KG");
	}

}
