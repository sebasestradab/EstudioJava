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
			pass = JOptionPane.showInputDialog("Introdue la contrase�a por favor");
			
			if(clave.equals(pass) == false){
				System.out.println("Contrase�a incorrecta " + pass);
			}
		}
		
		System.out.println("Contrase�a correcta. Acceso permitido");
	}

}
