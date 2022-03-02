package Futbol;

abstract public class Persona {
	String nombre;
	String apellidos;
	int añoNacimiento;
	
	/** 
	 * Constructor por defecto
	 */
	public Persona() {
		nombre="";
		apellidos="";
		añoNacimiento=0;
	}
	
	/**
	* Constructor parametrizado
	* @param nombre Parámetro que define el nombre de una persona
	* @param apellidos Parámetro que define los apellidos de una persona
	* @param añoNacimiento Parámetro que define el año de nacimiento de una persona
	*/
	public Persona(String nombre, String apellidos, int añoNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.añoNacimiento = añoNacimiento;
		}
	
	/**
	 * Constructor de copia
	 */
	public Persona(Persona persona) {
		this.nombre = persona.nombre;
		this.apellidos = persona.apellidos;
		this.añoNacimiento = persona.añoNacimiento;
	}
}