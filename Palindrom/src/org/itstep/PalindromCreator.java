package org.itstep;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PalindromCreator {
	private static Logger logger = Logger.getLogger(PalindromCreator.class.getName());

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		for(int i =100; i< 1000;i ++){
			for(int j =100;j<1000; j++){
				int multResult =i*j;
				if (isPalindrom(multResult)) {
					numbers.add(multResult);
				}
			}
		}
		int maxValue = getMaxPalindrom(numbers);
		logger.log(Level.INFO, "MaximalPalindrom is", + maxValue);
	}

	public static  boolean isPalindrom(int palindromNomber) {
		String palindromText = String.valueOf(palindromNomber);
		char[] symbols = palindromText.toCharArray();
		int lastIndex = symbols.length - 1;
		for (int i = 0; i < symbols.length / 2; i++) {// ����
			if (symbols[i] != symbols[symbols.length - 1 - i]) {
				return false;
			}

		}

		return true;
	}

	public static int getMaxPalindrom(LinkedList<Integer> numberList) {
		int maxValue = Integer.MIN_VALUE;
		for (Integer integer : numberList) {//foreach//123, 456, 789, 147, 258, 369
			if (integer>= maxValue) {
				maxValue = integer;
			}
		}
		return maxValue;
	}


}
