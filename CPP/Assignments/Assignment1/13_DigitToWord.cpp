#include<iostream>
int showDigit(int num)
{
int rem,rev=0;
    while (num > 0)
    {
        rem = num % 10;
	rev = rev * 10 + rem;
        num = num / 10;
    }
    return rev;
}
int main()
{
    int num,rem;
    std::cout << "Enter a number: ";
    std::cin >> num;
    num = showDigit(num);
    while(num>0)
    {
	rem = num % 10;
	num = num / 10;

	switch(rem)
	{
		case 1: std::cout<<"One ";
			break;
		case 2: std::cout<<"Two ";
			break;
		case 3: std::cout<<"Three ";
			break;
		case 4: std::cout<<"Four ";
			break;
		case 5: std::cout<<"Five ";
			break;
		case 6: std::cout<<"Six ";
			break;
		case 7: std::cout<<"Seven ";
			break;
		case 8: std::cout<<"Eight ";
			break;
		case 9: std::cout<<"Nine ";
			break;
		case 0: std::cout<<"Zero ";
			break;
	}
    }
    std::cout<<std::endl;
}
