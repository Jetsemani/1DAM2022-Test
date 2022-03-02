package Futbol;

public class Centrocampista extends Jugador {
	int numeroAsistencias;
	
	/**
	* Constructor de la clase Centrocampista
	* @param nombre Parámetro que define el nombre de un centrocampista
	* @param apellidos Parámetro que define los apellidos de un centrocampista
	* @param añoNacimiento Parámetro que define el año de nacimiento de un centrocampista
	* @param númeroAsistencias Parámetro que define la cantidad de 
	* asistencias de un centrocampista
	* @param numeroAsistencias 
	*/
	public Centrocampista(String nombre, String apellidos, int añoNacimiento, int numeroAsistencias) {
	super(nombre, apellidos, añoNacimiento);
	this.numeroAsistencias = numeroAsistencias;
	}
	
	/**
	* Método que convierte a String los datos de un centrocampista
	* @return Un String con los datos de un centrocampista
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Año de nacimiento = " + añoNacimiento + ", Asistencias = " + numeroAsistencias;
	}
}