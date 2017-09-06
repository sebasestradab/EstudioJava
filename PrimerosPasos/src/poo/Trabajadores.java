package poo;

public interface Trabajadores {
	public static final double bonus_base = 1500;
	
	// No es necesario poner el public abstract
	public abstract double establece_bonus(double gratificacion);	
}
