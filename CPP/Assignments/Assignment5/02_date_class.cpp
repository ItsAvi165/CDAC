#include <iostream>
using namespace std;

class Date
{
    int day;
    int month;
    int year;

public:
    // constructor overloader start
    // Date() {} // constructor created
    // Date(int d, int m, int y)
    // {
    //     day = d;
    //     month = m;
    //     year = y;
    // }
    void Read()
    {
        do // for validation
        {
            cin >> day >> month >> year;
            if ((day > 31 || day < 0) || (month > 12 || month < 0) || (year < 0))
                cout << "Enter valid date " << endl;
        } while ((day > 31 || day < 0) || (month > 12 || month < 0) || (year < 0));
    }
    void Write()
    {
        cout << day << "/" << month << "/" << year << endl;
    }
    bool operator==(Date obj2)
    {
        if (day == obj2.day && month == obj2.month && year == obj2.year)
            return true;
        else
            return false;
    }

    bool operator<(Date obj2)
    {
        if (year < obj2.year)
            return true;
        else if (year == obj2.year)
        {
            if (month == obj2.month)
            {
                if (day < obj2.day)
                    return true;
                else
                    return false;
            }
            if (month < obj2.month)
                return true;
            else
                return false;
        }
    }

    bool operator>(Date obj2)
    {
        if (year > obj2.year)
            return true;
        else if (year == obj2.year)
        {
            if (month == obj2.month)
            {
                if (day > obj2.day)
                    return true;
                else
                    return false;
            }
            if (month > obj2.month)
                return true;
            else
                return false;
        }
        // return false;
    }
    //~Date();
};

int main()
{
    Date d1;
    Date d2;
    cout << "Enter first date in DD/MM/YYYY format " << endl;
    d1.Read();
    cout << "Enter second date in DD/MM/YYYY format " << endl;
    d2.Read();
    if (d1 == d2)
        cout << "Both the dates are equal " << endl;
    else if (d1 > d2)
        cout << "First date is greater than second " << endl;
    else if (d1 < d2)
        cout << "First date is smaller than second " << endl;

    return 0;
}