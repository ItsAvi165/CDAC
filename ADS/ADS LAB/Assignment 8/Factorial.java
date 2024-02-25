package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		System.out.println(" Factorial of " + num + " is : " + factorial(num));
	}

	public static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num<0) {
			return -1;
		}
		if (num == 0) {
			return 1;
		} else {
			return num * factorial(num-1);
		}
	}

}
