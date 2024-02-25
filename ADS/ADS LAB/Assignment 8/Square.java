package recursion;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" square of : " + square(0));
	}

	public static int square(int num) {
		// TODO Auto-generated method stub
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
