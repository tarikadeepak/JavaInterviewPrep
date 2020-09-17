package coding.interview;

public class Fibonacci {
	int fibonacci(int n) {
		if (n==1 ||n==2) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
