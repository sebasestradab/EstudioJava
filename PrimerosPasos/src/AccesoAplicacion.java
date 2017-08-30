//===============================
// Tutorial de Java YouTube
// CLASE: Areas
// Video 18
//===============================
import javax.swing.*;

public class AccesoAplicacion {

	public static void main(String[] args) {
		String clave, pass;
		
		clave = "Sebastian";
		pass = "";
		
		while(clave.equals(pass) == false){
			pass = JOptionPane.showInputDialog("Introdue la contraseña por favor");
			
			if(clave.equals(pass) == false){
				System.out.println("Contraseña incorrecta " + pass);
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");
	}

}
