/*Algorithm:
1. do like reverse number algorithm except printing within repeation do addition
*/
#include <iostream>
int doDigitSum(int num)
{
	if(num<0) num*=(-1);
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
    std::cout << "Enter a number: ";
    std::cin >> num;
    std::cout << "Sum of digits of number " << num << " is: "<< doDigitSum(num) << "\n";
    return 0;
}
