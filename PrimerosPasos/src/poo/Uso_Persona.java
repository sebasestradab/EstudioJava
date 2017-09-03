package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Ana Lopez", "Biológicas");
		
		for(Persona p:lasPersonas) {
			System.out.println(p.dameNombre() + ". " + p.dameDescripcion());
		}
	}

}

abstract class Persona{
	private String nombre;
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
}

class Empleado2 extends Persona{
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente = 1;
	
	public Empleado2(String nom, double sue, int ano, int mes, int dia){
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		
		altaContrato = calendario.getTime();
		Id = IdSiguiente;
		IdSiguiente++;
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
	
	public String dameDescripcion() {
		return "Este empleado tiene un Id = " + Id + " con un sueldo = " + sueldo;
	}
}

class Alumno extends Persona{
	private String carrera;
	
	public Alumno(String nom, String car) {
		super(nom);
		this.carrera = car;
	}
	
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
}
