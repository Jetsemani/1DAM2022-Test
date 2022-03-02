package Futbol;

public class Portero extends Jugador {
	int golesRecibidos;
	
	/**
	* Constructor de la clase Portero
	* @param nombre Par�metro que define el nombre del portero
	* @param apellidos Par�metro que define los apellidos del portero
	* @param a�oNacimiento Par�metro que define el a�o de nacimiento del portero
	* @param golesRecibidos Par�metro que define la cantidad de goles recibidos por el portero
	*/
	public Portero(String nombre, String apellidos, int a�oNacimiento, int golesRecibidos) {
	super(nombre, apellidos, a�oNacimiento);
	this.golesRecibidos = golesRecibidos;
	}
	
	/**
	* M�todo que convierte a String los datos del portero
	* @return Un String con los datos del portero
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", A�o de nacimiento = " + a�oNacimiento + ", Goles recibidos = " + golesRecibidos;
	}
}