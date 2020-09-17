package coding.interview;

public class StringAnagram {
	boolean isStringAnagram(String str1, String str2) {
		char[] charArrayStr1 = str1.toCharArray();
		char[] charArrayStr2 = str2.toCharArray();
		int[] asciiCharacterSet = new int[256];
		for(char charElement : charArrayStr1) {
			asciiCharacterSet[charElement]++;
		}
		for(char charElement : charArrayStr2) {
			asciiCharacterSet[charElement]--;
		}
		for(int i : asciiCharacterSet) {
			if(i > 0)
				return false;
		}
		return true;
	}

}
