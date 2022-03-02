package Futbol;

public class Delantero extends Jugador {
	int golesAnotados;
	
	/**
	* Constructor de la clase Delantero
	* @param nombre Par�metro que define el nombre de un delantero
	* @param apellidos Par�metro que define los apellidos de un delantero
	* @param a�oNacimiento Par�metro que define el a�o de nacimiento de un delantero
	* @param golesAnotados Par�metro que define el n�mero de goles 
	* anotados por un delantero
	*/
	public Delantero(String nombre, String apellidos,int a�oNacimiento, int golesAnotados) {
	super(nombre, apellidos, a�oNacimiento);
	this.golesAnotados = golesAnotados;
	}
	
	/**
	* M�todo que convierte a String los datos de un delantero
	* @return Un String con los datos de un delantero
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", A�o de nacimiento = " + a�oNacimiento + ", Goles anotados = " + golesAnotados;
	}
}