package Futbol;

abstract public class Persona {
	String nombre;
	String apellidos;
	int a�oNacimiento;
	
	/** 
	 * Constructor por defecto
	 */
	public Persona() {
		nombre="";
		apellidos="";
		a�oNacimiento=0;
	}
	
	/**
	* Constructor parametrizado
	* @param nombre Par�metro que define el nombre de una persona
	* @param apellidos Par�metro que define los apellidos de una persona
	* @param a�oNacimiento Par�metro que define el a�o de nacimiento de una persona
	*/
	public Persona(String nombre, String apellidos, int a�oNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.a�oNacimiento = a�oNacimiento;
		}
	
	/**
	 * Constructor de copia
	 */
	public Persona(Persona persona) {
		this.nombre = persona.nombre;
		this.apellidos = persona.apellidos;
		this.a�oNacimiento = persona.a�oNacimiento;
	}
}