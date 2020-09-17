package coding.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test() {
		Fibonacci fib = new Fibonacci();
		assertTrue(89 == fib.fibonacci(10));
		assertTrue(1 == fib.fibonacci(1));
		assertTrue(3 == fib.fibonacci(3));
	}

}
