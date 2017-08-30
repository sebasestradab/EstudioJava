//===============================
// Tutorial de Java YouTube
// CLASE: Uso_Empleado
// Video 33-34-35
//===============================
package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		/*Empleado empleado1 = new Empleado("Paco G�mez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Ana L�pez", 95000, 1995, 06, 02);
		Empleado empleado3 = new Empleado("Maria Mart�n", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + 
				" Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + 
				" Fecha de Alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + 
				" Fecha de Alta: " + empleado3.dameFechaContrato());
		*/
		
		Empleado[] misEmpleados = new Empleado[4];
		
		misEmpleados[0] = new Empleado("Paco G�mez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana L�pez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Mart�n", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		
		/*for(int i=0;i<misEmpleados.length;i++){
			misEmpleados[i].subeSueldo(5);
		}*/
		
		// FOR mejorado
		for(Empleado e: misEmpleados){
			e.subeSueldo(5);
		}
		
		for(int i=0;i<misEmpleados.length;i++){
			System.out.println("Nombre " + misEmpleados[i].dameNombre()
								+ " Sueldo " + misEmpleados[i].dameSueldo()
								+ " Fecha de Alta " + misEmpleados[i].dameFechaContrato());
		}
	}

}

class Empleado{
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	public Empleado(String nom, double sue, int ano, int mes, int dia){
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nom){
		this(nom, 30000, 2000, 01, 01);
	}
	
	public String dameNombre(){
		return nombre;
	}
	
	public double dameSueldo(){
		return sueldo;
	}
	
	public Date dameFechaContrato(){
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje){
		double aumento = sueldo*porcentaje/100;
		
		sueldo += aumento;
	}
}
