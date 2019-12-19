package Jenkins_gradle;

public class Conductor {

	private int edad;
	private int puntosLicencia;
	
	public Conductor() {}
	
	public Conductor(int edad, int puntosLicencia) {
		this.edad = edad;
		this.puntosLicencia = puntosLicencia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPuntosLicencia() {
		return puntosLicencia;
	}

	public void setPuntosLicencia(int puntosLicencia) {
		this.puntosLicencia = puntosLicencia;
	}	
}
