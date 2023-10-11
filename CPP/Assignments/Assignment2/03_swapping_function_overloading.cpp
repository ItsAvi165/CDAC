#include<iostream>
using namespace std;
void swap(int &a,int &b)
{
	int temp = a;a = b;b = temp;
}
void swap(float &a,float &b)
{
	float temp = a;a = b;b = temp;
}
int main()
{
	int n1,n2;
	float f1,f2;
	int c;
	cout<<"Which number swapping you want to do: \n1. Floating points\n2. Integers\n";
	cin>>c;
	if(c == 2)
	{	
		cout<<"Enter integers: \n";
		cin>>n1>>n2;
 		swap(n1,n2);
		cout<<"Swapped number are "<<n1<<" and "<<n2<<endl; 
	}
	else if(c == 1)
	{
		cout<<"Enter floating: \n";
		cin>>f1>>f2;
 		swap(f1,f2);
		cout<<"Swapped number are "<<f1<<" and "<<f2<<endl; 
	}
	return 0;
}
