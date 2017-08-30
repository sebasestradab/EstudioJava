//===============================
// Tutorial de Java YouTube
// CLASE: Pruebas
// Video 36-37-38
//===============================

package poo;

public class Pruebas {
	
	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.cambioseccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" +
						   trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		
		/*System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		*/
	}

}

class Empleados{
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;
	
	public Empleados(String nom){
		nombre = nom;
		seccion = "Administración";
		Id = IdSiguiente;
		IdSiguiente++;
	}
	
	public void cambioseccion(String seccion){
		this.seccion = seccion;
	}
	
	public String devuelveDatos(){
		return "El nombre es : " +  nombre + ", la sección es " + seccion + " y el Id " + Id;
	}
	
	public static String dameIdSiguiente(){
		return "El Id siguiente es: " + IdSiguiente;
	}
}
