package Futbol;

public class Portero extends Jugador {
	int golesRecibidos;
	
	/**
	* Constructor de la clase Portero
	* @param nombre Parámetro que define el nombre del portero
	* @param apellidos Parámetro que define los apellidos del portero
	* @param añoNacimiento Parámetro que define el año de nacimiento del portero
	* @param golesRecibidos Parámetro que define la cantidad de goles recibidos por el portero
	*/
	public Portero(String nombre, String apellidos, int añoNacimiento, int golesRecibidos) {
	super(nombre, apellidos, añoNacimiento);
	this.golesRecibidos = golesRecibidos;
	}
	
	/**
	* Método que convierte a String los datos del portero
	* @return Un String con los datos del portero
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Año de nacimiento = " + añoNacimiento + ", Goles recibidos = " + golesRecibidos;
	}
}