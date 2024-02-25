import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(" Enter a number: ");
			Scanner sc = new Scanner(System.in);
			System.out.println(" sum of digits: " + digits(sc.nextInt()));
			sc.close();
	}

	private static int digits(int n) {
		// TODO Auto-generated method stub
		if(n<0) {
			n=n*(-1);
		}
		int sum = 0;
		if (n < 10) {
			return n % 10;
		} else {
			sum = n % 10;
			return digits(n / 10) + sum;
		}
	}

}
