/*Algorithm:
*/
#include <iostream>
int findDigit(int num,int search)
{
    int rem, quo, count=0;
    while (num != 0)
    {
        rem = num % 10;
	if(rem == search) count++;
        num = num / 10;
    }
    return count;
}
int main()
{
    int num,search_no;
    std::cout << "Enter a number: ";
    std::cin >> num;
    std::cout<<"Enter your single digit to count: ";
    std::cin>>search_no;
    std::cout <<search_no<<" is repeated in number "<<num<<", "<<findDigit(num,search_no);
   if(findDigit(num,search_no) == 1)
	 std::cout<<" time.\n";
   else
	  std::cout<<" times.\n";
}
