package vehiculos;

public class Avion extends Vehiculo implements PuedeVolar, ReproductorMusica{

	private int tama�oAlas;
	private String cancion;
	private String arrancar;
	public String aparcar;
	
	public Avion(String combustible, float velocidadMaxima, int pasajeros, int ruedas, int tama�oAlas, String repostar) {
		super(combustible, velocidadMaxima, pasajeros, ruedas, repostar);
		this.tama�oAlas = tama�oAlas;		
	}
	
	@Override
	public String toString() {
		return "Avion [tama�oAlas= " + tama�oAlas + " "+ super.toString()+ "]";
	}
	
	public int getTama�oAlas() {
		return tama�oAlas;
	}

	public void setTama�oAlas(int tama�oAlas) {
		this.tama�oAlas = tama�oAlas;
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
