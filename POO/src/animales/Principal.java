package animales;

public class Principal {

	public static void main(String[] args) {

		Mono mono = new Mono(16, 1.5f, 24, 2, "Negro", "Chimpancé");
		
		System.out.println(mono);

		Animal animal = mono;
		animal.desplazar(5, 9);
		System.out.println();
		
		Perro perro = new Perro(8, 0.2f, 12, 4, "Marrón", "Salchicha");
		
		System.out.println(perro);

		animal = perro;
		animal.desplazar(1, 4);

		
		Pato pato = new Pato(2, 1.5f, 3, 2, "Blancas", "Verde mustio");
		
		System.out.println(pato);
		
		animal = pato;
		animal.desplazar(5, 9);
		
	}

}