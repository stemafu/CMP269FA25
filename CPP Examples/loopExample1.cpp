
#include <iostream>

using namespace std;
/*

Loops and conditional statements in C++


Functions

A function is a named block of code that performs some defined action.

In C++ a function is defined using the following format.

returnType functionName(Parameters){
    // Body of the function
}

If a function does not return a value, its return type will be
void.
*/

/*

The following function takes an int n parameter and
returns the sum of the first n natural numbers.

This is a stand-alone function. This function is not a part
of any class.
*/
int sum(int num){
    int total = 0;
    
    for(int i = 0; i <= num; i++){
        // This is the body of the for loop
        total = total + i;
    
    }

    return total;

}

int total(int n){

    int sum = 0;

    int counter = 0;
    while(counter <= n){
        sum = counter + sum;
        counter++;

    }

    return sum;
}


int main(){

    /*
    A C++ for loop is just like a Java for loop
    */
   int myTotal = sum(5);
   std::cout << "Total is " << myTotal << "\n";


   int total1 = total(5);
   std::cout << "Total is " << total1 << "\n";


   /*

   The following is the format of an if-else if statement in 
   C++. Notice that the format just looks like the one in Java.
   */
   int score = 90;
   //str grade = "";
   if(score >= 93){
    cout << "A" << endl;
   }else if (score >= 90 && score <= 92){
    cout << "A-" << endl;
   }else{
    cout << "not a or b-" << endl;
   }
   //if(y == 0){
    //std::err << "cannot divide by zero";
   // return 1;
   //}else{
      //somevariable = x / y
   //}


   /*

   Arrays in C++

   One way of creating an array in C++, is that you provide
   a datayTpe followed by an arrayName [size]
   int nums[6];
   */

   int scores[6];

   scores[0] = 90;
   scores[1] = 100;
   scores[2]= 40;
   scores[3] = 70;
   scores[4] = 80;
   scores[5] = 26;

   cout << scores[0] << endl;
   cout << scores[10] << endl;

    return 0;
}

