//===============================
// Tutorial de Java YouTube
// CLASE: Coche
// Video 28-29-30-31-32
//===============================
package poo;

public class Coche {
	private int ruedas, largo, ancho, motor, peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche(){
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	Coche(int ruedas){
		this.ruedas = ruedas;
	}
	
	public String dime_datos_generales(){
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas" +
				". Mide " + largo/1000 + " metros con un ancho de " + ancho + 
				" cm y un peso de plataforma de " + peso_plataforma + "kg.";
	}
	
	public void establece_color(String color){
		this.color = color;
	}
	
	public String dime_color(){
		return "El color del coche es " + this.color;
	}
	
	public void configura_asientos(String asientos_cuero){
		if(asientos_cuero.equalsIgnoreCase("sI")){
			this.asientos_cuero = true;
		}else{
			this.asientos_cuero = false;
		}
	}
	
	public String dime_asientos(){
		if(asientos_cuero){
			return "El coche tiene asientos de cuero";
		}else{
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configura_climatizador(String climatizador){
		if(climatizador.equalsIgnoreCase("Si")){
			this.climatizador = true;
		}else{
			this.climatizador = false;
		}
	}
	
	public String dime_climatizador(){
		if(climatizador){
			return "El coche incorpora Climatizador";
		}else{
			return "El coche lleva aire acondicionado";
		}
	}
	
	// Practica no recomendada Setter y Getter en el mismo Metodo.
	public String dime_peso_coche(){
		int peso_carroceria = 500;
		
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero) {peso_total += 50;}
		
		if(climatizador) peso_total += 20;
		
		return "El peso del coche es " + peso_total;
	}
	
	public int precio_coche(){
		int precio_final = 10000;
		
		if(asientos_cuero){precio_final += 2000;}
		
		if(climatizador) precio_final += 1500;
		
		return precio_final;
	}
}
