#include <iostream>
class Date
{
    int day;
    int month;
    int year;

public:
    // constructor created
    Date() {}
    // constructor overload
    Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    void Read()
    {
        std::cout << "Day: ";
        std::cin >> day;
        std::cout << "Month: ";
        std::cin >> month;
        std::cout << "Year: ";
        std::cin >> year;
    }
    void Write()
    {
        std::cout << "DD:MM:YY " << day << ":" << month << ":" << year << std::endl;
    }

    bool operator=(BigInt obj2)
    {
        if (day == obj2.day)
            return true;
        else
            return false;
    }
    bool operator+(BigInt obj2)
    {
        if (day > obj2.day)
            return true;
        else
            return false;
    }
    bool operator-(BigInt obj2)
    {
        if (day < obj2.day)
            return true;
        else
            return false;
    }
    ~Date()
    {
    }
};
int main()
{
    Date d1, d2(11, 11, 2024);
    std::cout << "Enter date: ";
    d1.Read();
    d1.Write();
    d2.Write();
    std::cout << (d1 = d2) << std::endl;
    if (d1 = d2)
        std::cout << "Equal date" << std::endl;
    else
        std::cout << " Not equal dae" << std::endl;
}
