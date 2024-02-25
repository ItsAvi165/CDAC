package recursion;

public class Palindrome {

	public static void main(String[] args) {
		int num = 4162261;
		if(palindrome(num)==true) System.out.println("Inpur number is palindrome");
		else System.out.println("Input number is not palindrome");
	}

	public static boolean palindrome(int num) {
		if (num < 0) {
			num = num * (-1);
		}
		int first = num, last = num % 10, reduced, count = 0, temp = 1;
		if (num > 0) {
			count = countOfDigits(num);
			for (int i = 1; i < count; i++) {
				first = first / 10;
			}
		}
		for (int i = 1; i < count; i++) {
			temp = temp * 10;
		}
		temp = temp * first;

		if (first == last) {
			reduced = num - temp;
			if (reduced == 0) {
				return true;
			}
			return palindrome(reduced / 10);
		} else {
			return false;
		}
	}

	public static int countOfDigits(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

}
