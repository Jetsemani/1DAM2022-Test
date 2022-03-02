package animales;

public class Coche extends Animal{

	private int patas;
	private String pelaje;
	private String raza;
	
	/**
	 * Contructor por defecto
	 */
	public Coche(){
		super();
		
		patas=0;
		pelaje="";
		raza="";
	}
	
	public Coche(Coche coche) {
		super( (Animal) coche );
		
		this.patas = coche.patas;
		this.pelaje = coche.pelaje;
		this.raza = coche.raza;
	}
	
	public Coche(float peso, float estatura, int edad , int patas, String pelaje, String raza) {
		super(peso, estatura, edad);
		
		this.patas = patas;
		this.pelaje = pelaje;
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Mono [Número de piernas=" + patas + ", Color del pelo=" + pelaje + ", Raza=" + raza + ", " + super.toString()
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

