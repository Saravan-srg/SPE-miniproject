/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <iostream>
#include <cmath>


using namespace std;

double  squareRoot(double num) {
    return sqrt(num);
}

int factorial(int num) {
    int result = 1;
    for(int i=1; i<=num; i++) {
        result *= i;
    }
    
    return result;
}

double naturalLog(double num) {
    return log(num);
}

int powerFunction(int x, int p) {
    return pow(x, p);
}

void menu() {
    cout << "\n******** CALCULATOR ********" << endl;
    cout << endl;
    cout << "Press 1 to find square root of a number\n";
    cout << "Press 2 to find factorial of a number\n";
    cout << "Press 3 to find the natural logarithm(base e) of a number\n";
    cout << "Press 4 to find the power of a number raised to another number\n";
    cout << "Press 9 to exit\n";
    cout << endl;
}

void calculate(int choice) {
    switch(choice) {
    case 9: {//Exit
        cout << "Closing calculator...\n";
        //break;
        exit(0);
    }
    
    case 1: {//sq root
        double inputNum;
        cout << "Enter number: ";
        cin >> inputNum;
        cout << "Result: " << squareRoot(inputNum) << endl; 
        break;
    }
    
    case 2: {//factorial
        int inputNum;
        cout << "Enter number: ";
        cin >> inputNum;
        cout << "Result: " << factorial(inputNum) << endl;
        break;
    }
    
    case 3: {// natural log
        double inputNum;
        cout << "Enter number: ";
        cin >> inputNum;
        cout << "Result: " << naturalLog(inputNum) << endl;
        break;
    }
    
    case 4: {//power
        int baseNum;
        int powNum;
        cout << "Enter base number: ";
        cin >> baseNum;
        
        cout << "Enter power: ";
        cin >> powNum;
        cout << "Result: " << powerFunction(baseNum, powNum) << endl;
        break;
    }
    
    default:
        cout << "Wrong input\n";
    }
}

int main()
{
    while(1) {
        menu();
    
        cout << "Enter choice: ";
        int choice;
        cin >> choice;
    
        calculate(choice);
    }
    return 0;
}
