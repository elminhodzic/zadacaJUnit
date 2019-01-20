package zadatak1;

public class Convertor {
	
	private double a;

	public Convertor() {

	}
	
	public double IzKilogrameUFunte(double a) {
		
		return a * 2.2046;
	}
	
	public double IzFuntiUKilograme (double a) {
		
		return a / 2.2046;
	}

	public double izCentimetaraUInce(double a) {
		
		return a * 0.39370;
	}
	
	public double izInciUCentimetre (double a) {
		
		return a / 0.39370;
	}
	
	public double izCelzijusaUFaran (double a) {
		 
		return (a * 1.8000) + 32.00;
	}
	
	public double izFaranhajtaUCelzijuse (double a) {
		
		return (a - 32) / 1.8;
	}

}
