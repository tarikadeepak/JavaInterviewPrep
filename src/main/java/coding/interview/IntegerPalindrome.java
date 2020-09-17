package coding.interview;

public class IntegerPalindrome {
	boolean isIntegerPalindrome(int n) {
		int reverse = 0;
		int number = n;
		while(number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		return (n == reverse);		
	}
}
