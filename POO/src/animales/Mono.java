package animales;

public class Mono extends Animal {

	private int patas;
	private String pelaje;
	private String raza;
	
	/**
	 * Contructor por defecto
	 */
	public Mono() {
		super();
		
		patas=0;
		pelaje="";
		raza="";
	}

	public Mono(Mono mono) {
		super( (Animal) mono );
		
		this.patas = mono.patas;
		this.pelaje = mono.pelaje;
		this.raza = mono.raza;
	}
	public Mono(float peso, float estatura, int edad , int patas, String pelaje, String raza) {
		super(peso, estatura, edad);
		
		this.patas = patas;
		this.pelaje = pelaje;
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Mono [patas=" + patas + ", pelaje=" + pelaje + ", raza=" + raza + "," + super.toString()
				+ "]";
	}

	public boolean desplazar(int x, int y) {
		boolean desplazado=false;
		System.out.println("Soy un mono y me desplazo hasta las coordenadas "+x+ " e "+y);
		
		desplazado=true;
		return desplazado;
	}

	public int getPatas() {
		return patas;
	}

	public String getPelaje() {
		return pelaje;
	}

	public String getRaza() {
		return raza;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	

}
