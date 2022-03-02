package vehiculos;

public class Motocicleta extends Vehiculo{

	private int escapes;
	private String arrancar;

	public Motocicleta(String combustible, float velocidadMaxima, int pasajeros, int ruedas, int cilindrada, int escapes, String repostar) {
		super(combustible, velocidadMaxima, pasajeros, ruedas, repostar);
		this.escapes = escapes;
	}
	
	@Override
	public String toString() {
		return "Motocicleta [escapes= " + escapes + " " + super.toString()+ "]";
	}
	
	public int getEscapes() {
		return escapes;
	}

	public void setEscapes(int escapes) {
		this.escapes = escapes;
	}
	
	@Override
	public void repostar() {	
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
