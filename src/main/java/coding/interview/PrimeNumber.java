package coding.interview;

public class PrimeNumber {
	boolean isPrime(int n) {
		if(n==0 || n ==1)
			return false;
		if(n%2 == 0)
			return false;
		for(int i=3; i< Math.sqrt(n);i++) {
			if(n%i ==0)
				return false;
		}
		return true;
	}

}
