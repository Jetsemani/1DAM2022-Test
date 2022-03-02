package Futbol;

abstract public class Jugador extends Persona {
	/**
	* Constructor de la clase Jugador
	* @param nombre Parámetro que define el nombre de un jugador
	* @param apellidos Parámetro que define los apellidos de un jugador
	* @param añoNacimiento Parámetro que define el año de nacimiento de un jugador
	*/
	Jugador(String nombre, String apellidos, int añoNacimiento) {
	super(nombre, apellidos, añoNacimiento);
	}
}