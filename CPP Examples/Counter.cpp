
#include <iostream>

using namespace std;

class Counter{

    private:
    int count;


    public:
    int getCount();
    void setCount();
    void setCount(int newCount);
    void reset();
};



void Counter::setCount(){
    count++;
}

void Counter::setCount(int newCount){
    count = count + newCount;
}

int Counter::getCount(){
    return count;
}

void Counter::reset(){
    count = 0;
}


int main(){

    Counter c;

    c.reset();

    c.setCount();

    cout << c.getCount() << endl;

    c.setCount();
    cout << c.getCount() << endl;

    c.setCount(3);
    cout << c.getCount() << endl;

    return 0;
}