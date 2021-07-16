package es.cic.bootcamp.ejercicioTry;

import java.io.IOException;

public class Coche {
	
	

	public double arracarMotor(double potencia1, double potencia2) throws CocheException, IOException {
		if (potencia1 < 20.00) {
			throw new CocheException("Primer Motor no llega a potencia Minima, arracando segundo motor");

		}  if (potencia1 + potencia2 < 20.00) {
			throw new CocheException("La suma de los motores no llega a potencia Minima, no se arranca el coche");
		}
		return potencia1 + potencia2;

	}
	


}
