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
bool Compare(char src[],char dest[])
{
	int i=0;
	int s1,s2;
	s1=strlen(src);
	s2=strlen(dest);
	if(s1 != s2)
	{
		return false;
	}
	while(src[i] != '\0')
	{
		if(src[i] != dest[i]) 
			return false;
		i++;
	}
	return true;
}
int main()
{
	char src[]="Hello";
	char dest[]="Helloo";
	int size = strlen(src);
	std::cout<<"String length: "<<size<<std::endl;
	std::cout<<"Comparision: "<<Compare(src,dest)<<std::endl;	
	return 0;
}
