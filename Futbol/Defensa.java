package Futbol;

public class Defensa extends Jugador {
	
	/**
	* Constructor de la clase Defensa
	* @param nombre Parámetro que define el nombre de un defensa
	* @param apellidos Parámetro que define los apellidos de un defensa
	* @param añoNacimiento Parámetro que define el año de nacimiento de un defensa
	*/
	public Defensa(String nombre, String apellidos, int añoNacimiento) {
	super(nombre, apellidos, añoNacimiento);
	}
	
	/**
	* Método que convierte a String los datos de un defensa
	* @return Un String con los datos de un defensa
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Año de nacimiento = " + añoNacimiento;
	}
}