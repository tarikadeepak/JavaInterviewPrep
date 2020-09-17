package coding.interview;

public class ReverseString {
	String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int strLength = str.length();
		char[] reverseCharArray = new char[strLength];
		for (int i=0;i<strLength;i++) {
			reverseCharArray[i] = charArray[strLength - (i+1)];
		}
		return new String(reverseCharArray);
	}

}
