import java.util.Scanner;

class CheckDataType {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two double numbers");
    double num1 = 0;
    double num2 = 0;
    if (sc.hasNextDouble()) {
      num1 = sc.nextDouble();
    } else {
      System.out.println("Double value not inserted, program terminating....");
      System.exit(1);
    }
    if (sc.hasNextDouble()) {
      num2 = sc.nextDouble();
    } else {
      System.out.println("Double value not inserted, program terminating....");
      System.exit(1);
    }
    double avg = (num1 + num2) / 2;
    System.out.println("Average is " + avg);
    sc.close();
  }
}


int arr[10];
int[] arr;