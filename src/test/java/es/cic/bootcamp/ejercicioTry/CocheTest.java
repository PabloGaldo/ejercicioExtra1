package es.cic.bootcamp.ejercicioTry;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CocheTest {

	private Coche cut;

	@BeforeEach
	void setUp() throws Exception {
		this.cut = new Coche();
	}

	@Test
	void testCoche() throws CocheException, IOException {
		try {
			cut.arracarMotor(12.10, 9.00);

		} catch (CocheException e) {
			e.printStackTrace();

		} finally {
			System.out.println("Apagando Motores");
		}
	}
}
