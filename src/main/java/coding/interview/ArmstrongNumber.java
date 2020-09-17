package coding.interview;

public class ArmstrongNumber {
	boolean isArmstrongNum(int n) {
		int sum = 0;
		int number = n;
		while(number !=0) {
			int reminder = number % 10;
			sum = sum + (reminder * reminder * reminder);
			number = number / 10;
		}
		return (sum == n);
	}

}
