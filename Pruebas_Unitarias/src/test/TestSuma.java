package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import GUI.Suma;

public class TestSuma {

	@Test
	public void test_ok_1 () {
		Suma suma = new Suma();
		double resultado = suma.getSuma(1.0, 1.0);
		assertEquals(2.0, resultado);
	}

	@Test
	public void test_ok_2 () {
		Suma suma = new Suma();
		double resultado = suma.getSuma(1000000.0, 1000000.0);
		assertEquals(2000000.0, resultado);
	}
	@Test
	public void test_fail () {
		Suma suma = new Suma();
		assertNotNull(suma);
		double resultado = suma.getSuma(1.0, 1.0);
		assertNotEquals(8.0, resultado);
	}
}
