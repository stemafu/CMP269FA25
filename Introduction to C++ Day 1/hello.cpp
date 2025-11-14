

#include <iostream>


/* This is a comment in C++
*/

// 

/*

Just like in Java, C++ program execution starts in the main function.


We just want this C++ program to print to the screen(console) the following message.

Hello World!
Hello World from Lehman College!
*/


using namespace std;
int main(){


    /*
    Variable declaration in C++;

    In C++, we declare a variable the same way like in Java.

    We start with the dataType followed by variable name and a semicolon.
    
    We also assign values to variable the same way we did in Java.
    */

    int age;

    age = 60;

    cout << "Hello World!" << endl;
    cout << "Hello World from Lehman College!" << endl;

    cout << "Lehman College is " << age << " years old" ;

    return 0;
}