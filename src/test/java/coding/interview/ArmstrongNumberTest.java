package coding.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArmstrongNumberTest {

	@Test
	public void test() {
		ArmstrongNumber armstrongNum = new ArmstrongNumber();
		assertTrue(armstrongNum.isArmstrongNum(153));
		assertTrue(armstrongNum.isArmstrongNum(370));
		assertFalse(armstrongNum.isArmstrongNum(111));
	}

}
