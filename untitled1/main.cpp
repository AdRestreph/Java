#include <iostream>
using namespace std;

int main() {

    int arr[5] = {1,2,3,4,5};

    int *ptr = &arr[0];
    ptr++;
    cout << *ptr <<endl;
    ptr--;

    *ptr = *ptr + 4;
    cout << *ptr <<endl;

    ptr = ptr + 4;
    cout << ptr <<endl;

    return 0;
}
