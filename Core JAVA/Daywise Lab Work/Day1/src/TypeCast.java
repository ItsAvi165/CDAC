import java.util.Scanner;

public class TypeCast
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        // long l = scan.nextLong();
        // int i = scan.nextInt();
        // float f = scan.nextFloat();
        // long sum=l+f;
        // will give compile time error because l+f is float but sum is long which is lossy conversion
        // float sum=l+f;
        // int sum=i+l;
        //sum is int but i+l is long
        // long sum=i+l; 
        // System.out.println("Sum "+sum);
        // char a=10;
        //System.out.println("Char: "+ a);
        //10 in ASCII is new line 
        // char ch=97;  
        //int num=97;
        //char ch=(int)num;
        char ch1 = 'b';
        int num2 = ch1;
        System.out.println("Char: "+ num2);
    scan.close();
    }
}