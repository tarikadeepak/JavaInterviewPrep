package coding.interview;

public class StringPalindrome {
	boolean isPalindrome(String str) {
		ReverseString reverseString = new ReverseString();
		return (reverseString.reverseString(str)).equals(str);
	}

}
