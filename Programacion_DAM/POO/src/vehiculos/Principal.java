package vehiculos;

public class Principal {
	
	public static void main(String[] args) {
	
		Coche coche = new Coche("Gasolina", 160, 5, 4, 6, "lleno");
		
		System.out.println(coche);
		
		coche.arrancarMotor("Encendido");
		coche.aparcarVehiculo();
		coche.reproducirCancion("La Macarena");
		
		System.out.println("El coche esta: " + coche.arrancarMotor());
		System.out.println("Reproduciendo: " + coche.cancionActual());
		System.out.println("");


		Avion avion = new Avion("Queroseno", 400, 60, 12, 15, "lleno");
		
		System.out.println(avion);
		
		avion.arrancarMotor("Encendido");
		avion.aparcarVehiculo("No");
		avion.volar();

		avion.reproducirCancion("La cucaracha");

		System.out.println("El avion esta: " + avion.arrancarMotor());
		System.out.println("Reproduciendo: " + avion.cancionActual());
		System.out.println("");
		
		Motocicleta motocicleta = new Motocicleta("Diésel", 100, 2, 2, 3, 3, "vacio");
		
		System.out.println(motocicleta);
		
		motocicleta.aparcarVehiculo();
		motocicleta.arrancarMotor("Parada");
				
		System.out.println("La moto esta: " + motocicleta.arrancarMotor());
	}		
}
