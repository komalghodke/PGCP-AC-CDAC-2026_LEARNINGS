#include <iostream>
using namespace std;
/* Q.1. Create a class Analyzer that stores numbers dynamically. 
    Requirements: 
    Accept number of elements N. 
    Dynamically allocate array. 
    Accept numbers. 
    Find and print: 
    Maximum number 
    Minimum number 
    Average value
*/

class Analyzer {
private:
    int *arr; //HERE IT STORES ADD OF N Int
    int size;

public:
    Analyzer(int n) {
        size = n;
        arr = new int[size]; //requests memory from the heap for DMA
    }

    void acceptNumbers() {
        cout << "Enter " << size << " numbers:\n";
        for (int i = 0; i < size; i++) {
            cin >> arr[i]; // *(arr + i)
        }
    }

    int findMax() {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int findMin() {
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    double findAverage() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return (double)sum / size;
    }

    ~Analyzer() {
        delete[] arr;
    }
};

int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    Analyzer obj(n);

    obj.acceptNumbers();

    cout << "Maximum number: " << obj.findMax() << endl;
    cout << "Minimum number: " << obj.findMin() << endl;
    cout << "Average value: " << obj.findAverage() << endl;

    return 0;
}
