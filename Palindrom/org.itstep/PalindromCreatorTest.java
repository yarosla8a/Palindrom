import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.itstep.PalindromCreator;
import org.junit.jupiter.api.Test;

class PalindromCreatorTest {

	@Test
	void testIsPalindrom() {
		int palindromNomber = 1234321;
		int notpalindromNomber = 1234567;
		PalindromCreator creator = new PalindromCreator();
		boolean isPalindrom = creator.isPalindrom(palindromNomber);
		assertTrue(isPalindrom);
		boolean notPalindrom = creator.isPalindrom(notpalindromNomber);
		assertTrue(!notPalindrom);// ! is not true;
	}

	@Test
	void testGetMaxPalindrom() {
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.addAll(Arrays.asList(123, 456, 789, 147, 258, 369));
		PalindromCreator creator = new PalindromCreator();
		int maxValue = creator.getMaxPalindrom(numberList);
		assertEquals(789, maxValue);
	}

}
