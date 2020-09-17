package coding.interview;

public class StringMethods {

	public static void main(String[] args) {
		// Returns the character at the specified index.
		System.out.println("charAt - " + "Deepak".charAt(4));
		
		/**
		 * compareTo - Compares this String to another Object.
		 * The value 0 if the argument is a string lexicographically equal to this string; 
		 * a value less than 0 if the argument is a string lexicographically greater than this string; 
		 * and a value greater than 0 if the argument is a string lexicographically less than this string.
		 */
		System.out.println("compareTo 1 - " + new String("Deepak").compareTo("Divya"));
		System.out.println("compareTo 2 - " + new String("Divya").compareTo((new String("Deepak"))));
		
		/**
		 * concat - Concatenates the specified string to the end of this string.
		 */
		System.out.println("concat - " + "Divya ".concat("Deepak"));
		
		/**
		 * copyValueOf(data, offset, count)- returns a String that represents the character sequence in the array specified.
		 * data − the character array.
    	 * offset − initial offset of the subarray.
    	 * count − length of the subarray.
		 */
		char[] data = {'h', 'e', 'l', 'l', 'o'};
		System.out.println("copyValueOf " + "".copyValueOf(data ,2, 2));
		
		/**
		 * equals - 
		 * This method compares this string to the specified object. T
		 * he result is true if and only if the argument is not null and 
		 * is a String object that represents the same sequence of characters as this object.
		 */
		System.out.println("equals - " + ("Deepak".equals("Deepak")));
		System.out.println("equalsIgnoreCase - " + ("Deepak".equalsIgnoreCase("deepak")));
		
		/**
		 * getChars(int srcBegin, int srcEnd, char[] dst,  int dstBegin) -
		 * This method copies characters from this string into the destination character array.
		 * srcBegin − index of the first character in the string to copy.
    	 * srcEnd − index after the last character in the string to copy.
    	 * dst − the destination array.
    	 * dstBegin − the start offset in the destination array.
		 */
		char [] getCharsTest = new char[10];
		"My name is Deepak Tarika".getChars(3, 13, getCharsTest, 0);
		System.out.println("getChars " + getCharsTest);
	}

}
