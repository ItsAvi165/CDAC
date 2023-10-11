#include<iostream>
using namespace std;
void swap(int a,int b)
{
	int temp = a;a = b;b = temp;
	cout<<"Swapped number is "<<a<<" and "<<b<<endl; 
}
int main()
{
	int n1,n2;
	cout<<"Enter two numbers for swapping: ";
	cin>>n1>>n2;
	swap(n1,n2);
	return 0;
}
