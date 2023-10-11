
#include <iostream>
bool isPalindrome(int num)
{
    int rem,quo;
    int rev_num = 0;
    quo = num;
    while (quo > 0)
    {
        rem = quo % 10;
        quo = quo / 10;
        rev_num = rev_num * 10 + rem;
    }
    if(rev_num == num)
    {
	    return true;
    }
    else
    {
	    return false;
    }

}
int main()
{
    int num;
    std::cout << "Enter a number: ";
    std::cin >> num;
    if(isPalindrome(num) == true)
	    std::cout<<"Number "<<num<<" is a Palindrome\n";
    else
	    std::cout<<"Number "<<num<<" is NOT a Palindrome\n";

    return 0;
}
