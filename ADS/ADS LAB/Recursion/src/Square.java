import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println("Square of : " + square(sc.nextInt()));
	}

	public static int square(int num) {
		
		if(num<0) {
			num = num * (-1);
		}
		if(num==0) {
			return num;
		}else if(num==1) {
			return num;
		}else {
			return square(num-1) + 2*(num-1)+1;
		}
	}

}
