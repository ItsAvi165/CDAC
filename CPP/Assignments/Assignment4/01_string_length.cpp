#include<iostream>
int strlen(char a[])
{
	int count=0;
	while(a[count] != '\0')
	{
		count++;
	}
	return count;
}
int main()
{
	char src[]="Hello";
	int size = strlen(src);
	std::cout<<"String length: "<<size<<std::endl;
}
