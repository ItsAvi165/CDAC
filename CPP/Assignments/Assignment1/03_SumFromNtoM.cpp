/*
Algorithm:
1. take N and M from the user
2. Start with N and increment by 1 till M
3. Add the numbers from N incremented till M
*/

#include <iostream>
int doSum(int num1,int num2)
{
    int sum = 0;
	for(int i=num1;i<=num2;i++)
        {
            sum += num1;
        }
	return sum;

}
int main()
{
    int num1, num2;

    do{
    	std::cout << "Enter number 1: ";
    	std::cin >> num1;
    	std::cout << "Enter number 2: ";
    	std::cin >> num2;
	std::cout<<std::endl;

    }while(num1 > num2);

        std::cout << "Sum from " << num1 << " and " << num2 << " is " << doSum(num1,num2) << std::endl;
}
