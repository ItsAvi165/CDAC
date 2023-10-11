/*Algorithm:
1. find the factor of number
2. add numbers with each iterations of correct factors
3. check the given number and the total addition
4. if the given number is equal to total addition then its a perfect number
5. else it isn't a perfect number
*/
#include <iostream>
bool isPerfect(int num)
{
	int sum=0;
	for(int i=1;i<num;i++)
	{	
    		if (num % i == 0)
    		{
            		sum = sum + i;
			//std::cout<<i<<std::endl;
    		}
	}
	//std::cout<<sum;
	if (sum == num)
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
	do                                                
	{                                                 
    		std::cout << "Enter a positive number: ";     
    		std::cin >> num;                              
	}                                                 
	while (num < 0);                                  
 
    if(isPerfect(num) == true)
    {
	    std::cout <<num << " is Perfect Number "<<std::endl;
    }
    else
    {
	    std::cout <<num << " is Not Perfect Number "<<std::endl;
    }
    return 0;
}
