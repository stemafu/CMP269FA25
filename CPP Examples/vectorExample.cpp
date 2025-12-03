

#include <iostream>
#include <string>

using namespace std;

/*
C++ is an object-oriented programming language just like Java.

We can be able to create classes that in turn become blueprints
for creating objects of those classes.

In C++, a class is created using the keyword class.

The following is the general template of a C++ class.

class ClassName{
   variables and methods
};

*/

class person{
/* 

instance variables,
instance methods,
constructors. The constructors can be overloaded.
Method overloading
encapsulation
inheritance
multiple inheritance
Polymorphism
*/

    private:
    int age;
    double height;
    string name;

    public:

    person(){
        age = 1;
        height = 1;
        name = "no name given at the moment";
    }

    /*
    Constructor overloading. Defining the same constructor multiple times but with
    different parameters.
    */
    person(int newAge, double newHeight, string newName){
        if(newAge < 0){
            age = 0;
        }else{
            age = newAge;
        }
        
        if(newHeight < 0){
            height = 0;
        }else{
            height = newHeight;
        }
        
        name = newName;
    }


    void setAge(int newAge){
        if(newAge < 0){
            age = 0;
        }else{
            age = newAge;
        }  
    }

    void setHeight(double newHeight){
        if(newHeight < 0){
            height = 0.0;
        }else{
            height = newHeight;
        }
    }

    void setName(string newName){
        name = newName;
    }

    int getAge(){
        return age;
    }

    double getHeight(){
        return height;
    }

    string getName(){
        return name;
    }

    void display(){
    cout << "Age: " << getAge() << endl;
    cout << "Height: " << getHeight() << endl;
    cout << "Name: " << getName() << endl;
    }

};


/*
In C++, we do have two different way how we can implement instance (member) methods of a class
1. We can implement the method fully inside the class just like the above methods.
2. We can provide the method definition inside a class and implement them elsewhere.
This second option is usually ideal for very large programs.
*/

int main(){


    /*
    How we create an object of class i C++.
    
    nameOftheClass objectName;
    */

    person p1;

    /*
    How do we access members of an objects.
    We use the dot operator to access the members of an objects.
    Members can be instance variable or instance methods.
    */

    // I may want to set the age and height of the object p1
    p1.setAge(9);
    p1.setHeight( 5.0);
    p1.setName("John");


    //std::cout  
    p1.display();

    /* It is also possible for you to accept input from the keyboard.
     We can use cin to get input from the keyboard.
    
    */

    int userAge;
    double userHeight;
    string userName;

    cout << "Enter your age: ";
    cin >> userAge;

    cout << "Enter your height: ";
    cin >> userHeight;

    cout << "Enter your name: ";
    cin >> userName;

    person p2;

    p2.setAge(userAge);
    p2.setHeight(userHeight);
    p2.setName(userName);

    p2.display();

    person p3;
    p3.display();


    /*
    p4 whose age is 30, whose height is 6.4 and her name is mary.
    We want to use our paramterized contructor.
    
    */
   person p4(30, 6.4, "Mary");
   p4.display();

    
    return 0;
}