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
void strcopy(char src[],char dest[])
{
	int i=0;
	while(src[i] != '\0')
	{
		dest[i] = src[i];
		i++;
	}
}
int main()
{
	char src[]="Hello";

	int size = strlen(src);
	char dest[size];
	std::cout<<"String length: "<<size<<std::endl;
	std::cout<<"Copied string: "<<std::endl;
	strcopy(src,dest);
	for(int i=0;i<size;i++)
	{
		std::cout<<dest[i];
	}
}
