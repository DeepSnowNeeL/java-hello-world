package test.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExempleTest {

	Calcul c = new Calcul();

	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforeAll");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("beforeEach");
	}

	@Test
	public void testAdditionPositive() {
		assertEquals(10, c.add(5, 5));
	}

	@Test
	public void testAdditionNegative() {
		assertEquals(-10, c.add(-5, -5));
	}

	@Test
	public void testAdditionPositiveNegative() {
		assertEquals(0, c.add(-5, 5));
	}
}
