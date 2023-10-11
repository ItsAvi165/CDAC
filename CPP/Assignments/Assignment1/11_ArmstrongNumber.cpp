#include <iostream>
using namespace std;
void isArmstrong(int num){
    int rem, quo, count = 0, pro, sum = 0;
    int original_num = quo = num;
    
    while (num > 0)
    {
        rem = num % 10;
        num = num / 10;
        count++;
    }
    
    for (int i = 0; i < count; i++)
    {
        rem = quo % 10;
        pro = 1;
        for (int j = 0; j < count; j++)
        {
            pro = pro * rem;
        }
        sum = sum + pro;
        quo = quo / 10;
    }

    if (sum == original_num)
        cout << original_num << " is Armstrong number \n";
    else
        cout << original_num << " is not an Armstrong number \n";
}
int main()
{
    int num;
    cout << "Enter a number: ";
    cin >> num;
   
    isArmstrong(num);

    return 0;
}
