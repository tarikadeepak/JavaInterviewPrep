package coding.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintRepeatedCharactersTest {

	@Test
	public void test() {
		PrintRepeatedCharacters printRepeatedCharacters = new PrintRepeatedCharacters();
		printRepeatedCharacters.printRepeatedCharacters("abca");
		printRepeatedCharacters.printRepeatedCharacters("abcabdee");
	}

}
