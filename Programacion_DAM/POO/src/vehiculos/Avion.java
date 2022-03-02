package vehiculos;

public class Avion extends Vehiculo implements PuedeVolar, ReproductorMusica{

	private int tamañoAlas;
	private String cancion;
	private String arrancar;
	public String aparcar;
	
	public Avion(String combustible, float velocidadMaxima, int pasajeros, int ruedas, int tamañoAlas, String repostar) {
		super(combustible, velocidadMaxima, pasajeros, ruedas, repostar);
		this.tamañoAlas = tamañoAlas;		
	}
	
	@Override
	public String toString() {
		return "Avion [tamañoAlas= " + tamañoAlas + " "+ super.toString()+ "]";
	}
	
	public int getTamañoAlas() {
		return tamañoAlas;
	}

	public void setTamañoAlas(int tamañoAlas) {
		this.tamañoAlas = tamañoAlas;
	}

	@Override
	public void volar() {
		System.out.println("Esta volando");
	}

	@Override
	public void aterrizar() {
		System.out.println("Esta aterrizando");
	}

	@Override
	public void repostar() {
	}

	@Override
	public void reproducirCancion(String cancion) {
		this.cancion = cancion;
	}

	@Override
	public String cancionActual() {
		return this.cancion;
	}
			
	public void arrancarMotor(String arrancar) {
		this.arrancar = arrancar;
	}
	
	@Override
	public String arrancarMotor() {
		return this.arrancar;
	}

	public void aparcarVehiculo(String aparcar) {
		this.aparcar = aparcar;
	}
	
	@Override
	public void aparcarVehiculo() {
		System.out.println("Aparcado");
	}
}
