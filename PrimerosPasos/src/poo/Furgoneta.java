//===============================
// Tutorial de Java YouTube
// CLASE: Furgoneta
// Video 40-41 - Herencia
//===============================

package poo;

public class Furgoneta extends Coche {
	private int capacidad_carga, plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga){
		super(); // Llamar el constructor de la clase padre
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}
	
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es " + capacidad_carga + " y las plazas son " + plazas_extra;
	}
}
