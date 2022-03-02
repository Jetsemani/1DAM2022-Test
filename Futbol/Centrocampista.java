package Futbol;

public class Centrocampista extends Jugador {
	int numeroAsistencias;
	
	/**
	* Constructor de la clase Centrocampista
	* @param nombre Par�metro que define el nombre de un centrocampista
	* @param apellidos Par�metro que define los apellidos de un centrocampista
	* @param a�oNacimiento Par�metro que define el a�o de nacimiento de un centrocampista
	* @param n�meroAsistencias Par�metro que define la cantidad de 
	* asistencias de un centrocampista
	* @param numeroAsistencias 
	*/
	public Centrocampista(String nombre, String apellidos, int a�oNacimiento, int numeroAsistencias) {
	super(nombre, apellidos, a�oNacimiento);
	this.numeroAsistencias = numeroAsistencias;
	}
	
	/**
	* M�todo que convierte a String los datos de un centrocampista
	* @return Un String con los datos de un centrocampista
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", A�o de nacimiento = " + a�oNacimiento + ", Asistencias = " + numeroAsistencias;
	}
}