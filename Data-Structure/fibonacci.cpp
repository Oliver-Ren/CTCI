#include <iostream>
using namespace std;

class Solution{
public:
	int fibonacci(int month){
		if (month == 1) return 1;
		if (month <= 0) return 0;
		return fibonacci(month-2) + fibonacci(month-1);
	}	
};

int main(int argc, char * argv[]){
	Solution solver;
	for (int i = 1; i < 10; i ++){
		int result = solver.fibonacci(i);
		cout <<"The" << i << "th Fibonacci number is:" <<  result << endl;
	}
	return 0;
}


