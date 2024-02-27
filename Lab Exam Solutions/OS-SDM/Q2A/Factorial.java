import java.io.*;
import java.util.*;


// Main class
public class Factorial {

	// Method To calculate factorial
	static int factorial(int n)
	{

		// Handling base case if value of n=1 or n=0, it returns 1
		if (n == 0 || n == 1)
			return 1;

		// Generic case
		return n * factorial(n - 1);
	}


	// main driver method
	public static void main(String[] args)
	{

		// Calling method factorial to compute factorial and
		// storing the result into a variable
		int ans = factorial(5);

		// Display the factorial of number
		System.out.println("Factorial of 5 is :" + ans);
	}
}
