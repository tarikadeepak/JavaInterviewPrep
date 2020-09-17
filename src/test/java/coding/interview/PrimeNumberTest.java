package coding.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {

	@Test
	public void test() {
		PrimeNumber primeNum = new PrimeNumber();
		assertFalse(primeNum.isPrime(1));
		assertFalse(primeNum.isPrime(16));
		assertTrue(primeNum.isPrime(7));
	}

}
