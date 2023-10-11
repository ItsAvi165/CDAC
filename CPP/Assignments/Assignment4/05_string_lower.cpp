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
void ToUpper(char s[])
{
	/*
	 * ASCII: {A,B,C,D.....Z}
	 * 	{ 65,66,67.... }
	 * ASCII: {a,b,c,d.....z}
 		{ 97,98,99.... } 
		*/
	int i=0;
	while(s[i] != '\0')
	{
		if(s[i] <= 122 && s[i] >= 97)
		{
			std::cout<<s[i];
		}
		else
		{
			s[i]=s[i]+32;
			std::cout<<s[i];
		}
		i++;
	}
}
int main()
{
	char src[]="Hello";
	int size = strlen(src);
	std::cout<<"String length: "<<size<<std::endl;
	std::cout<<"String upper: "<<std::endl;
	ToUpper(src);
	std::cout<<std::endl;
}
