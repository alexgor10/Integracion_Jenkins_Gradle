package Jenkins_gradle;

public class Aseguradora {
	
	public static double calcularPrima(double tarifaBasica, 
			double factorEdad, 
			int reduccionConductorSeguro) {
		return tarifaBasica*factorEdad-reduccionConductorSeguro;
	}
	
	public static double factorEdad(Conductor conductor) {
		int edad = conductor.getEdad();
		if(edad >= 18 && edad < 25) return 2.8;
		else if(edad >= 25 && edad < 35) return 1.8;
		else if(edad >= 35 && edad < 45) return 1.0;
		else if(edad >= 45 && edad < 65) return 0.8;
		else if(edad >= 65 && edad <= 90) return 1.5;
		else return 0;
	}
	
	public static int puntosPuedoPerder(double factorEdad) {
		if(factorEdad == 2.8) return 1;
		else if(factorEdad == 1.8) return 3;
		else if(factorEdad == 1.0) return 5;
		else if(factorEdad == 0.8) return 7;
		else if(factorEdad == 1.5) return 5;
		else return 0;
	}
	
	public static int reduccionConductorSeguro(Conductor conductor) {
		double factorEdad = factorEdad(conductor);
		int puntosLicencia = conductor.getPuntosLicencia();
		if(puntosLicencia <= 0) {
			return -1;
		}
		if(puntosLicencia > 30) {
			return 1;
		}
		int puntosPuedoPerder = puntosPuedoPerder(factorEdad);
		if(factorEdad == 2.8 && 30 - puntosLicencia <= puntosPuedoPerder) return 50; 
		else if(factorEdad == 1.8 && 30 - puntosLicencia <= puntosPuedoPerder) return 50;
		else if(factorEdad == 1.0 && 30 - puntosLicencia <= puntosPuedoPerder) return 100;
		else if(factorEdad == 0.8 && 30 - puntosLicencia <= puntosPuedoPerder) return 150;
		else if(factorEdad == 1.5 && 30 - puntosLicencia <= puntosPuedoPerder) return 200;
		else return 0;
	}
}
