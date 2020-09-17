package coding.interview;

public class Factorial {
	int calculateFactorial(int n) {
		if(n == 1)
			return n;
		return n * calculateFactorial(n-1);
	}
}
