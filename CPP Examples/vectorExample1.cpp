

#include <iostream>
#include <string>
#include <vector>

using namespace std;


int main(){


    vector<string> arrayList;

    arrayList.push_back("USA");
    arrayList.push_back("Canada");
    arrayList.push_back("Mexico");
    arrayList.push_back("Brazil");

    cout << "There are " << arrayList.size() << " countries in the group." << endl;


    return 0;
}