import java.util.Scanner;

class Season{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); //sc holds System.in member called as wrapper class
        int month = sc.nextInt();
        switch (month){
            case 3:
                case 4:
                    case 5:
                        case 6:
                            System.out.println("Season is summer");
                            break;
            case 7:
                case 8:
                    case 9:
                        case 10:
                            System.out.println("Season is rainy");
                            break;
            case 11:
                case 12:
                    case 1:
                        case 2:
                            System.out.println("Season is winter");
                            break;
            default:
                System.out.println("Invalid month entered");
                break;
        } 
        //System.out.println(exit);
    }
}