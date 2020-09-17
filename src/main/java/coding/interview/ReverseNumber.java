package coding.interview;

public class ReverseNumber {
	int revereseNum(int n) {
		int number=n;
		int reverse=0;
		while(number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		return reverse;		
	}
}
