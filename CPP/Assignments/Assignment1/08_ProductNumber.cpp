/*Algorithm:
1. do reverse number algorithm except printing within repeation do multiplication
*/
#include <iostream>
int doDigitProduct(int num)
{
    int pro = 1, rem, quo;
    while (num > 0)
    {
        rem = num % 10;
        num = num / 10;
        pro *= rem;
    }
       return pro;
}

int main()
{
    int num;
    do
    {
        std::cout << "Enter a positive number: ";
	std::cin >> num;
    }
    while(num<0);

    std::cout << "Product of digits of number " << num << " is: " << doDigitProduct(num) << "\n";
    
    return 0;
}
