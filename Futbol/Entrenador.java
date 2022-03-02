package Futbol;

public class Entrenador extends Persona {
	int añosExperiencia;
	String nacionalidad;
	
	/**
	* Constructor de la clase Entrenador
	* @param nombre Parámetro que define el nombre de un entrenador
	* @param apellidos Parámetro que define los apellidos de un entrenador
	* @param añoNacimiento Parámetro que define lel año de nacimiento de un entrenador
	* @param añosExperiencia Parámetro que define los años de 
	* experiencia dirigiendo equipos del entrenador
	* @param nacionalidad Parámetro que define la nacionalidad del entrenador
	*/
	public Entrenador(String nombre, String apellidos, int añoNacimiento, int añosExperiencia, String nacionalidad) {
	super(nombre, apellidos, añoNacimiento);
	this.añosExperiencia = añosExperiencia;
	this.nacionalidad = nacionalidad;
	}
	
	/**
	* Método que convierte a String los datos del entrenador
	* @return Un String con los datos del entrenador
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", Año de nacimiento = " + añoNacimiento + ", Años de experiencia = " + añosExperiencia+ ", Nacionalidad = " + nacionalidad;
	}
}