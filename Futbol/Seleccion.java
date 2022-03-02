package Futbol;

public class Seleccion {
	String nombre;
	String pa�s;
	Entrenador entrenador;
	Portero portero;
	Defensa[] defensas;
	Centrocampista[] centrocampistas; 
	Delantero[] delanteros;
	
	/**
	* Constructor de la clase Seleccion
	* @param nombre Par�metro que define el nombre de la Seleccion
	* @param pa�s Par�metro que define el pa�s de la Seleccion
	*/
	public Seleccion(String nombre, String pa�s) {
	this.nombre = nombre;
	this.pa�s = pa�s;
	}
	
	/**
	* Constructor sobrecargado de la clase Seleccion
	* @param nombre Par�metro que define el nombre de la Seleccion
	* @param pa�s Par�metro que define el pa�s de la Seleccion
	* @param t�cnico Par�metro que define el entrenador de la Seleccion
	* @param portero Par�metro que define el portero de la Seleccion
	* @param defensas Par�metro que define los defensas de la Seleccion
	* @param mediocampos Par�metro que define los mediocampos de la Seleccion
	* @param delanteros Par�metro que define los delanteros de la Seleccion
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
	* M�todo que muestra en pantalla los datos del equipo junto con la 
	* informaci�n de su t�cnico, portero, defensas, centrocampistas y delanteros
	*/
	void imprimir() {
		System.out.print("Nombre del equipo = " + nombre);
		System.out.println(", Pa�s = " + pa�s);
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