//===============================
// Tutorial de Java YouTube
// CLASE: Uso_Empleado
// Video 33-34-35-42-44-49-50
//===============================
package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		/*Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 06, 02);
		Empleado empleado3 = new Empleado("Maria Martín", 105000, 2002, 03, 15);
		
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
		
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martín", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		misEmpleados[4] = jefe_RRHH; // Polimorfismo
		misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);
		
		Jefatura jefe_finanzas = (Jefatura) misEmpleados[5];
		jefe_finanzas.estableceIncentivo(55000);
		
		/*Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05, 05);
		Comparable ejemplo = new Empleado("Elizabeth", 95000, 2011, 05, 05);
		
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		
		
		if(ejemplo instanceof Comparable) System.out.println("Implementa la interfaz comparable");
		*/
		
		System.out.println(jefe_finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefe_finanzas.dameNombre() + " tiene un bonus de: " +
							jefe_finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].establece_bonus(200));
		
		// FOR mejorado
		//for(int i=0;i<misEmpleados.length;i++){
		for(Empleado e: misEmpleados){
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		//for(int i=0;i<misEmpleados.length;i++){
		for(Empleado e: misEmpleados){
			System.out.println("Nombre " + e.dameNombre()
								+ " Sueldo " + e.dameSueldo()
								+ " Fecha de Alta " + e.dameFechaContrato());
		}
	}

}

class Empleado implements Comparable, Trabajadores{
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente = 1;
	
	public Empleado(String nom, double sue, int ano, int mes, int dia){
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		
		altaContrato = calendario.getTime();
		Id = IdSiguiente;
		IdSiguiente++;
	}
	
	public Empleado(String nom){
		this(nom, 30000, 2000, 01, 01);
	}
	
	public String dameNombre(){
		return nombre + " Id: " + Id;
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
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if(this.Id < otroEmpleado.Id) return -1;
		if(this.Id > otroEmpleado.Id) return 1;

		return 0;
	}
	
	public double establece_bonus(double gratificacion) {
		return Trabajadores.bonus_base + gratificacion;
	}
}

class Jefatura extends Empleado implements Jefes {
	private double incentivo;
	
	public Jefatura(String nom, double sue, int ano, int mes, int dia) {
		super(nom, sue, ano, mes, dia);
	}
	
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	public String tomar_decisiones(String decision) {
		return "Un miembro de la dirección ha tomado la desición de: " + decision;
	}
	
	public double establece_bonus(double gratificacion) {
		double prima = 2000;
		
		return Trabajadores.bonus_base + gratificacion + prima;
	}
}
