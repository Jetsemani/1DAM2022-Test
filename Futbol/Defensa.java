package Futbol;

public class Defensa extends Jugador {
	
	/**
	* Constructor de la clase Defensa
	* @param nombre Par�metro que define el nombre de un defensa
	* @param apellidos Par�metro que define los apellidos de un defensa
	* @param a�oNacimiento Par�metro que define el a�o de nacimiento de un defensa
	*/
	public Defensa(String nombre, String apellidos, int a�oNacimiento) {
	super(nombre, apellidos, a�oNacimiento);
	}
	
	/**
	* M�todo que convierte a String los datos de un defensa
	* @return Un String con los datos de un defensa
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", A�o de nacimiento = " + a�oNacimiento;
	}
}