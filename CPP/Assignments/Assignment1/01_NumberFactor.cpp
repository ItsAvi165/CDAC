/*Algorithm:
1. Take a positive number from user (Build Error handler to avoid negative number)
2. Increment the number by 1 starting from 2 and and divide to obtain the number by user number
3. division to check the divisiblity test, if user number divides then print the number
*/
#include <iostream>
int main()
{
    int num;
    std::cout << "Enter a number: ";
    std::cin >> num;
    
    do
    {
        std::cout << "Number provided is negative\nInsert again: ";
        std::cin >> num;
    }
    while(num<0);

    std::cout<<"Factors of the number "<<num<<" are: ";
    for(int i=1;i<=num;i++)
    {
        if (num % i == 0)
        {
            std::cout << i << " ";
        }
    }
    std::cout<<std::endl;

    return 0;
}
