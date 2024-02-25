package test;

import java.util.Arrays;

class Digits {
	public int[] plusOne(int[] digits) {
		int lastDigit = digits[digits.length - 1];
		int quoteint = 0;
		int count = 0;
		lastDigit++;

		if (lastDigit < 10) {
			digits[digits.length - 1] = lastDigit;
		} else {
			for (int i = digits.length - 1; i >= 0 && lastDigit >= 10; i--) {
				System.out.println("i: " + i);
				digits[i] = lastDigit % 10;
				quoteint = lastDigit / 10;
				if (lastDigit >= 10) {
					lastDigit = quoteint + digits[i - 1];
					System.out.println("new: " + quoteint + " last: " + lastDigit);
				}
				System.out.println("modified: " + i + " " + digits[i]);
			}
			if (quoteint != 0) {
				count++;
			}
			System.out.println("*" + count);
			int[] newDigitsArray = new int[digits.length + count];

			if (lastDigit >= 10) {
				newDigitsArray[0] = quoteint;
			} else {
				newDigitsArray[0] = lastDigit;
			}

			for (int i = 1; i < newDigitsArray.length; i++) {
				newDigitsArray[i] = digits[i - 1];
			}
			return newDigitsArray;
		}
		return digits;
	}

}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Digits().plusOne(new int[] { 8, 9, 9, 9 })));
	}
}