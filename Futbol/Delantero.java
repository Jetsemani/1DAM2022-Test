package Futbol;

public class Delantero extends Jugador {
	int golesAnotados;
	
	/**
	* Constructor de la clase Delantero
	* @param nombre Parámetro que define el nombre de un delantero
	* @param apellidos Parámetro que define los apellidos de un delantero
	* @param añoNacimiento Parámetro que define el año de nacimiento de un delantero
	* @param golesAnotados Parámetro que define el número de goles 
	* anotados por un delantero
	*/
	public Delantero(String nombre, String apellidos,int añoNacimiento, int golesAnotados) {
	super(nombre, apellidos, añoNacimiento);
	this.golesAnotados = golesAnotados;
	}
	
	/**
	* Método que convierte a String los datos de un delantero
	* @return Un String con los datos de un delantero
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Año de nacimiento = " + añoNacimiento + ", Goles anotados = " + golesAnotados;
	}
}