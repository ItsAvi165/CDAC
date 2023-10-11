#include<iostream>
bool isPrime(int num)
{
	if(num<=1)
	{
		return false;
	}
	
	for(int i=2;i<num;i++)
	{
		if(num%i == 0)
		{
			return false;
		}
	}	
	return true;
}
int main()
{
	int num1,num2;

	do{

		std::cout<<"Enter num1: ";
		std::cin>>num1;
		std::cout<<"Enter num2: ";
		std::cin>>num2;

	}while(num1>num2);

	std::cout<<"Prime numbers between "<<num1<<" and "<<num2<<" is: ";
	for(int i=num1;i<=num2;i++)
	{
		if(isPrime(i))
		{
			std::cout<<i<<" ";
		}
	}

	std::cout<<std::endl;

	return 0;
}
