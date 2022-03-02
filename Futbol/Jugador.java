package Futbol;

abstract public class Jugador extends Persona {
	/**
	* Constructor de la clase Jugador
	* @param nombre Par�metro que define el nombre de un jugador
	* @param apellidos Par�metro que define los apellidos de un jugador
	* @param a�oNacimiento Par�metro que define el a�o de nacimiento de un jugador
	*/
	Jugador(String nombre, String apellidos, int a�oNacimiento) {
	super(nombre, apellidos, a�oNacimiento);
	}
}