package es.cic.bootcamp.ejercicioTry;

public class Motor {
	
	private double potencia;
	private double potencia2;

	public Motor(double potencia, double potencia2) {
		super();
		this.potencia = potencia;
		this.potencia2 = potencia2;
	}

	public Motor() {
		super();
	}

	public double getPotencia() {
		this.potencia = Math.floor((Math.random() * (30 - 10 + 1)));
		return potencia;
	}

	
	
	
	

}
