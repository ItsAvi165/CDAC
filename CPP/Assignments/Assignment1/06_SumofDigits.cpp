/*Algorithm:
1. do reverse number algorithm except printing within repeation do addition
*/
#include <iostream>
int doDigitSum(int num)
{
    int sum = 0, rem, quo;
    while (num > 0)
    {
        rem = num % 10;
        num = num / 10;
        sum = sum + rem;
    }
	return sum;
}
int main()
{
    int num;
    do
    {
    	std::cout << "Enter a positive number: ";
    	std::cin >> num;
    }
    while (num < 0);

    std::cout << "Sum of digits of number " << num << " is: " << doDigitSum(num) << "\n";

    return 0;
}
