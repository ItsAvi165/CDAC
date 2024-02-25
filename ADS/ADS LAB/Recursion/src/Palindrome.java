import java.util.Scanner;

class Palindrome {
// reverse of digits
	static int rev(int n, int sum) {
		if (n == 0)
			return sum;

		sum = (sum * 10) + (n % 10);

		return rev(n / 10, sum);
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome");
		n = sc.nextInt();
		int temp = rev(n, 0);

		if (temp == n)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not a palindrome");
		sc.close();
	}
}
