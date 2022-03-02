package vehiculos;

public class Coche extends Vehiculo implements ReproductorMusica{

	private int cilindrada;
	private String cancion;
	private String arrancar;
	public String aparcar;
	
	public Coche(String combustible, float velocidadMaxima, int pasajeros, int ruedas, int cilindrada, String repostar) {
		super(combustible, velocidadMaxima, pasajeros, ruedas, repostar);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		return "Coche [cilindrada= " + cilindrada + " " + super.toString()+ "]";
	}
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
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
	
	@Override
	public void aparcarVehiculo() {
		System.out.println("Aparcado");
	}

}