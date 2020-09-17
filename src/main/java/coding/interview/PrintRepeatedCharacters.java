package coding.interview;

public class PrintRepeatedCharacters {
	void printRepeatedCharacters(String str) {
		char[] charArray = str.toCharArray();
		int[] test = new int[256];
		for(char charArrayElement : charArray) {
			test[charArrayElement]++;
		}
		for(int i=0; i<256; i++) {
			if(test[i] > 1) {
				System.out.println(Character.toString(i));
			}
		}
	}

}
