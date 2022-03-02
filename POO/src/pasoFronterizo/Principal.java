package pasoFronterizo;

import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	private static Persona [] personas = new Persona[10];
	private static int contadorPersonas=0;
	
	public static void registrarPersona() {
		String nombre;
		String dni;
		
		System.out.println("Dime tu nombre:");
		nombre=sc.nextLine();
		System.out.println("Dime tu DNI:");
		dni=sc.nextLine();
	
		Persona persona = new Persona(nombre, dni);
		
		personas[contadorPersonas++]= persona;
	}
	
	public static void listarPersonas() {
//		for (Persona persona : personas) {
//			System.out.println(persona);
//		}
		for (int i = 0; i < contadorPersonas; i++) {
			System.out.println(personas[i]);
		}
	}
	
	public static void buscarNombre(String nombre) {
//		for (Persona persona : personas) {
//			if( persona.getNombre().equalsIgnoreCase(nombre) )
//				System.out.println(persona);
//		}
		
		for (int i = 0; i < contadorPersonas; i++) {
			if( personas[i].getNombre().equalsIgnoreCase(nombre) )
				System.out.println(personas[i]);		}
	}
	
	public static void buscarDni(String dni) {
//		for (Persona persona : personas) {
//			if( persona.getDni().equalsIgnoreCase(dni) )
//				System.out.println(persona);
//		}
		
		for (int i = 0; i < contadorPersonas; i++) {
			if( personas[i].getDni().equalsIgnoreCase(dni) )
				System.out.println(personas[i]);		}
	}
	
	public static void mostrarMenu() {
		int opcion;
		
		do {
			System.out.println("Bienvenido a mi menu.(Elige una opción 1-5)");
			System.out.println("1. Paso frontera");
			System.out.println("2. Mostrar listado personas");
			System.out.println("3. Buscar por nombre");
			System.out.println("4. Buscar por DNI");
			System.out.println("5. Salir");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				registrarPersona();
				break;

			case 2:
				listarPersonas();
				break;	

			case 3:
				System.out.println("Dime nombre a buscar:");
				String nombre=sc.nextLine();
				buscarNombre(nombre);

				break;

			case 4:
				System.out.println("Dime DNI a buscar:");
				String dni=sc.nextLine();
				buscarDni(dni);
				break;

			case 5:
				System.out.println("Saliendo...");
				sc.close();
				break;	

			default:
				System.out.println("Valor introducido incorrecto.");
				break;
			}

		}
		while( opcion != 5 );
	} 

	public static void main(String[] args) {
		mostrarMenu();
	}
}