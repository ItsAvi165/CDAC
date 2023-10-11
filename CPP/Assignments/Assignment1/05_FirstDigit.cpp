/*Algorithm:
1. do reverse number algorithm except printing within repeation
2. print last number reminder
*/
#include <iostream>
int firstDigit(int num)
{
	int rem;
    while (num > 0)
    {
        rem = num % 10;
        num = num / 10;
    }
    return rem;
}
int main()
{
    int num;
    std::cout << "Enter a number: ";
    std::cin >> num;

    std::cout << "First digit of " << num << " is: " << firstDigit(num) << "\n";

    return 0;
}
