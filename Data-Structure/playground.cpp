#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

#define SIZE 50
vector<int> intVector(100);

int main(){
	intVector[20] = 50;
	vector<int>::iterator intIter = find(intVector.begin(),intVector.end(),50);
	if ( intIter != intVector.end())
		cout << *intIter << "is found." << endl;
	else
		cout << "not found." << endl;
	return 0;
}
