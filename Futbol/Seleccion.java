package Futbol;

public class Seleccion {
	String nombre;
	String país;
	Entrenador entrenador;
	Portero portero;
	Defensa[] defensas;
	Centrocampista[] centrocampistas; 
	Delantero[] delanteros;
	
	/**
	* Constructor de la clase Seleccion
	* @param nombre Parámetro que define el nombre de la Seleccion
	* @param país Parámetro que define el país de la Seleccion
	*/
	public Seleccion(String nombre, String país) {
	this.nombre = nombre;
	this.país = país;
	}
	
	/**
	* Constructor sobrecargado de la clase Seleccion
	* @param nombre Parámetro que define el nombre de la Seleccion
	* @param país Parámetro que define el país de la Seleccion
	* @param técnico Parámetro que define el entrenador de la Seleccion
	* @param portero Parámetro que define el portero de la Seleccion
	* @param defensas Parámetro que define los defensas de la Seleccion
	* @param mediocampos Parámetro que define los mediocampos de la Seleccion
	* @param delanteros Parámetro que define los delanteros de la Seleccion
	*/
	public Seleccion(String nombre, String ciudad, Entrenador entrenador, Portero portero, Defensa[] defensas, Centrocampista[] centrocampistas, Delantero[] delanteros) {
	this(nombre, ciudad);
	this.entrenador = entrenador;
	this.portero = portero;
	this.defensas = defensas;
	this.centrocampistas = centrocampistas;
	this.delanteros = delanteros;
	}
	
	/**
	* Método que muestra en pantalla los datos del equipo junto con la 
	* información de su técnico, portero, defensas, centrocampistas y delanteros
	*/
	void imprimir() {
		System.out.print("Nombre del equipo = " + nombre);
		System.out.println(", País = " + país);
		System.out.println();
		System.out.println("Entrenador");
		System.out.println(entrenador);
		System.out.println();
		System.out.println("Portero");
		System.out.println(portero);
		System.out.println();
		System.out.println("Defensas");
		
		for (int i = 0; i < defensas.length; i++) {
		System.out.println(defensas[i]);
		}
		System.out.println();
		System.out.println("Centrocampistas");
		
		for (int j = 0; j < centrocampistas.length; j++) {
		System.out.println(centrocampistas[j]);
		} 
		System.out.println();
		System.out.println("Delanteros");
		
		for (int k = 0; k < delanteros.length; k++) {
		System.out.println(delanteros[k]);
		} 
	}
}