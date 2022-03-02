package Futbol;

public class Entrenador extends Persona {
	int a�osExperiencia;
	String nacionalidad;
	
	/**
	* Constructor de la clase Entrenador
	* @param nombre Par�metro que define el nombre de un entrenador
	* @param apellidos Par�metro que define los apellidos de un entrenador
	* @param a�oNacimiento Par�metro que define lel a�o de nacimiento de un entrenador
	* @param a�osExperiencia Par�metro que define los a�os de 
	* experiencia dirigiendo equipos del entrenador
	* @param nacionalidad Par�metro que define la nacionalidad del entrenador
	*/
	public Entrenador(String nombre, String apellidos, int a�oNacimiento, int a�osExperiencia, String nacionalidad) {
	super(nombre, apellidos, a�oNacimiento);
	this.a�osExperiencia = a�osExperiencia;
	this.nacionalidad = nacionalidad;
	}
	
	/**
	* M�todo que convierte a String los datos del entrenador
	* @return Un String con los datos del entrenador
	*/
	public String toString() {
	return "Nombre = " + nombre + ", Apellidos = " + apellidos + ", A�o de nacimiento = " + a�oNacimiento + ", A�os de experiencia = " + a�osExperiencia+ ", Nacionalidad = " + nacionalidad;
	}
}