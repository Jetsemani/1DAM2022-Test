package Futbol;

public class Principal {
	/**
	* Método main que crea en primer lugar los integrantes
	* de la Selección. Luego, compone el equipo y los muestra en pantalla
	*/
	public static void main(String[] args) {
	Entrenador entrenador = new Entrenador("Carlo","Ancelotti", 1959, 30, "Italiana"); 
	Portero portero = new Portero("Thibaut", "Courtois", 1992, 10);
	Defensa[] defensas = new Defensa[4];
	Centrocampista[] centrocampistas = new Centrocampista[4];
	Delantero[] delanteros = new Delantero[2];

	defensas[0] = new Defensa("Daniel", "Carvajal", 1992);
	defensas[1] = new Defensa("Eder", "Militao", 1998);
	defensas[2] = new Defensa("David", "Alaba", 1992);
	defensas[3] = new Defensa("Ferlan", "Mendy", 1995);
	centrocampistas[0] = new Centrocampista("Toni", "Kroos", 1990, 5);
	centrocampistas[1] = new Centrocampista("Luka", "Modric", 1985, 7);
	centrocampistas[2] = new Centrocampista("Carlos Henrique", "Casemiro", 1992, 2);
	centrocampistas[3] = new Centrocampista("Eden", "Hazard", 1991, 12);
	delanteros[0] = new Delantero("Karim", "Benzema", 1987, 18);
	delanteros[1] = new Delantero("Vinicius", "Junior", 2000, 12);

	Seleccion seleccion = new Seleccion("Real Madrid", "España", entrenador, portero, defensas, centrocampistas, delanteros);
	seleccion.imprimir();
	}
}
