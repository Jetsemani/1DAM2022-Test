package vehiculos;

public abstract class Vehiculo {
	
	private String combustible;
	private float velocidadMaxima;
	private int pasajeros;
	private int ruedas;
	private static int cantidadVehiculos;
	private String repostar;
	private String arrancar;
	private String aparcar;

	/**
	 * Constructor por defecto
	 */
	public Vehiculo() {
		combustible="";
		velocidadMaxima=0;
		pasajeros=0;
		ruedas=0;
		cantidadVehiculos=0;
		repostar="";
	}
	
	/**
	 * Constructor parametrizado
	 */
	public Vehiculo(String combustible, float velocidadMaxima, int pasajeros, int ruedas, String repostar){
		super();
		this.combustible = combustible;
		this.velocidadMaxima = velocidadMaxima;
		this.pasajeros = pasajeros;
		this.ruedas = ruedas;
		this.repostar = repostar;
		cantidadVehiculos++;
	}
	
	/**
	 * Constructor de copia
	 */
	public Vehiculo(Vehiculo vehiculo){
		this.combustible = vehiculo.combustible;
		this.velocidadMaxima = vehiculo.velocidadMaxima;
		this.pasajeros = vehiculo.pasajeros;
		this.ruedas = vehiculo.ruedas;
		this.repostar = vehiculo.repostar;
		this.cantidadVehiculos = vehiculo.cantidadVehiculos;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [cantidadVehiculos=" + cantidadVehiculos + ", combustible=" + combustible + ", velocidadMaxima=" + velocidadMaxima + ", pasajeros=" + pasajeros + ", ruedas=" + ruedas + ", deposito=" + repostar + "]";
	}
	
	public abstract void repostar();
	
	public String arrancarMotor() {
		return arrancar;
	}

	public abstract void aparcarVehiculo();

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
}
