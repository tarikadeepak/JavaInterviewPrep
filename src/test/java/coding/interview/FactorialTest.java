package coding.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		Factorial factorial = new Factorial();
		assertTrue(factorial.calculateFactorial(10) == 3628800);
		assertTrue(factorial.calculateFactorial(4) == 24);
	}

}
