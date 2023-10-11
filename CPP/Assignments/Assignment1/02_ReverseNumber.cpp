/*Algorithm:
1. take a number from user
2. find the reminder of user given number dividing by 10
3. do step 2 repetation until quotient is zero
4. print while repetation
*/
#include <iostream>
int doReverse(int num)
{
	int rem,quo;
	int rev_num = 0;
    while (num > 0)
    {
        rem = num % 10;
        num = num / 10;
	rev_num = rev_num * 10 + rem;
    }
    return rev_num;
}
int main()
{
    int num;
    std::cout << "Enter a number: ";
    std::cin >> num;

    std::cout<<"Reversed number: "<<doReverse(num)<<std::endl;
    return 0;
}
