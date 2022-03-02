package animales;

public abstract class Animal {

	private float peso;
	private float estatura;
	protected int edad; 
	
	
	/**
	 * Constructor por defecto
	 */
	public Animal(){
		peso=0;
		estatura=0;
		edad=0;
	}
	
	/**
	 * Constructor parametrizado
	 */
	public Animal(float peso, float estatura, int edad){
		this.peso = peso;
		this.estatura=estatura;
		this.edad=edad;
	}
	
	/**
	 * Constructor de copia
	 */
	public Animal(Animal animal){
		this.peso = animal.peso;
		this.estatura = animal.estatura;
		this.edad = animal.edad;
	}
	
	/**
	 * Método abstracto
	 */
	public abstract boolean desplazar(int x, int y);
	

	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", estatura=" + estatura + ", edad=" + edad + "]";
	}

	public float getPeso() {
		return peso;
	}

	public float getEstatura() {
		return estatura;
	}

	public int getEdad() {
		return edad;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}