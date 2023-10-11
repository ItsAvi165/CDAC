#include <iostream>
// class name is BigInt
class BigInt
{
	// member variable
	int num1;
	int num2;

public: // from now on all member function mentioned below are public
	// member function setter
	void setNum1(int n)
	{
		num1 = n;
	}
	void setNum2(int n)
	{
		num2 = n;
	}
	// function getter
	int getNum1()
	{
		return num1;
	}
	int getNum2()
	{
		return num2;
	}

	// Operator overloading
	bool operator==(BigInt obj2)
	{
		if (num1 == obj2.num2)
			return true;
		else
			return false;
	}
	bool operator>(BigInt obj2)
	{
		if (num1 > obj2.num2)
			return true;
		else
			return false;
	}
	bool operator<(BigInt obj2)
	{
		if (num1 < obj2.num2)
			return true;
		else
			return false;
	}
};
int main()
{
	BigInt o1, o2;
	// created object o1 and o2
	int x, y;
	std::cout << "Enter two numbers: ";
	std::cin >> x >> y;
	// accepting numbers x and y from users
	o1.setNum1(x);
	o2.setNum2(y);
	std::cout << "Number1 : " << o1.getNum1() << std::endl;
	std::cout << "Number2 : " << o2.getNum2() << std::endl;

	std::cout << (o1 = o2) << std::endl;
	if (o1 == o2)
		std::cout << o1.getNum1() << " is equal to " << o2.getNum2() << std::endl;
	else if (o1 > o2)
		std::cout << o1.getNum1() << " is greater than " << o2.getNum2() << std::endl;
	else if (o1 < o2)
		std::cout << o1.getNum1() << " is smaller than " << o2.getNum2() << std::endl;
	else
		std::cout << o1.getNum1() << " is not equal to " << o2.getNum2() << std::endl;

	return 0;
}
