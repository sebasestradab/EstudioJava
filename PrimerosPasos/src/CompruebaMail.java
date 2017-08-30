//===============================
// Tutorial de Java YouTube
// CLASE: CompruebaMail
// Video 21-22
//===============================
import javax.swing.JOptionPane;
public class CompruebaMail {

	public static void main(String[] args) {
		boolean arroba = false, punto = false;
		int contArroba = 0;
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		for(int i=0; i<mail.length(); i++){
			if(mail.charAt(i) == '@'){
				arroba = true;
				contArroba++;
			}
			
			if(mail.charAt(i) == '.'){
				punto = true;
			}
		}
		
		if(arroba && contArroba == 1 && punto){
			System.out.println("El mail es correcto");
		}else{
			System.out.println("El mail es incorrecto");
		}
		//System.out.println(mail.length());
	}

}
