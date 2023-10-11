import java.util.Scanner;

class FoodMenu
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount=0;
        int choice;
        do
        {
            System.out.println("--------CDAC Canteen Service--------");
            System.out.println("1. Dosa\n2. Samosa\n3. Idli\n4. Pohe\n5. Upma\n6. Pongal\n7. Uttappa\n8. Sandwitch\n9. Bhel\n10. Generate Bill\n");
            choice = sc.nextInt();
            switch(choice)
            {
		    case 1: amount+=20;
			   break; 
		    case 2: amount+=10;
			   break; 
		    case 3: amount+=25;
			   break; 
		    case 4: amount+=20;
			   break; 
		    case 5: amount+=20;
			   break; 
		    case 6: amount+=30;
			   break; 
		    case 7: amount+=20;
			   break; 
		    case 8: amount+=40;
			   break; 
		    case 9: amount+=50;
			   break; 
		    case 10: System.out.println("Total Bill: "+amount);
			   break; 
		    default: System.out.println("Please select Menu items");
			   break; 
            }
        }while(choice != 10);

    }
}
