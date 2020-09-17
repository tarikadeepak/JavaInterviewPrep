package coding.interview;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	char firstNonRepeatedChar(String str) {
		char[] charArray = str.toCharArray();
		int[] asciiCharCount = new int[256];
		int[] asciiCharIndex = new int[256];
		for(char charArrayElement : charArray) {
			asciiCharCount[charArrayElement]++;
		}
		for(int i=0; i<256; i++) {
			if(asciiCharCount[i] == 1) {
				asciiCharIndex[i] = str.indexOf(Character.toString(i));
			}else {
				asciiCharIndex[i] = -1;
			}
		}
		int leastIndex = str.length();
		for(int i=0; i<256; i++) {
			if(asciiCharIndex[i] >= 0 && asciiCharIndex[i] < leastIndex) {
				System.out.println();
				leastIndex = asciiCharIndex[i];
			}
		}
		System.out.println(charArray[leastIndex]);
		return charArray[leastIndex];
		
	}

}
