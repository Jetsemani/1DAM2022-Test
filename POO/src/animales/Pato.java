package animales;

public class Pato extends Animal{

		private int patas;
		private String colorPlumas;
		private String colorPico;
		
		/**
		 * Contructor por defecto
		 */
		public Pato(){
			super();
			
			patas=0;
			colorPlumas="";
			colorPico="";
		}
		
		public Pato(Pato pato) {
			super( (Animal) pato );
			
			this.patas = pato.patas;
			this.colorPlumas = pato.colorPlumas;
			this.colorPico = pato.colorPico;
		}
		
		public Pato(float peso, float estatura, int edad , int patas, String colorPlumas, String colorPico) {
			super(peso, estatura, edad);
			
			this.patas = patas;
			this.colorPlumas = colorPlumas;
			this.colorPico = colorPico;
		}

		@Override
		public String toString() {
			return "Pato [Número de patas=" + patas + ", Color de las plumas=" + colorPlumas + ", Color del pico=" + colorPico + ", " + super.toString()
					+ "]";
		}

		public boolean desplazar(int x, int y) {
			boolean desplazado=false;
			System.out.println("Soy un pato y me desplazo hasta las coordenadas "+x+ " e "+y);
			
			desplazado=true;
			return desplazado;
		}

		@Override
		public void setEdad(int edad) {
			if(edad<10) {
				//edad válida y grabar
				super.setEdad(edad);
				this.edad=edad;
			}
			else {
				//error
				System.out.println("Edad no válida, debe ser menor a diez años");
			}
		}
		
		
		
		public int getPatas() {
			return patas;
		}

		public String getColorPlumas() {
			return colorPlumas;
		}

		public String getcolorPico() {
			return colorPico;
		}

		public void setPatas(int patas) {
			this.patas = patas;
		}

		public void setPelaje(String pelaje) {
			this.colorPlumas = pelaje;
		}

		public void setRaza(String raza) {
			this.colorPico = raza;
		}
}