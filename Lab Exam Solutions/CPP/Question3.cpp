#include <iostream>
#include <fstream>
using namespace std;

// Function to calculate factorial of a number
int factorial(int n) {
    if (n <= 1) {
        return 1;
    }
    return n * factorial(n - 1);
}


int main() {
    int numbers[10]; //array to store 10 input numbers

    // Accepting 10 numbers from the user
    cout << "Enter 10 numbers:" <<endl;
    for (int i = 0; i < 10; ++i) {
        cin >> numbers[i];
    }

    // Calculating factorial of each number and writing to a text file saved by name "factorials.txt"
    ofstream outputFile("factorials.txt");
    if (outputFile.is_open()) {    //checking if the file is open then only perform the operation
        for (int i = 0; i < 10; ++i) {
            int fact = factorial(numbers[i]);
            outputFile << numbers[i] << "," << fact <<endl;
        }
        outputFile.close();   //closing the output file
        cout << "Input numbers and their factorials written to 'factorials.txt' file successfully." << std::endl;
    } else {    //If any error occured error msg is printed here
        cerr << "Unable to create/open file." << endl;
    }

    return 0;
}
