#include <iostream>
#include <vector>

using namespace std;

int_fast32_t main() {
    vector<int> out = {1, 2, 3, 4 , 5};
    for (int i : out) {
        cout << i << endl;
    }
    cout << "中文测试" << endl;
    return 0;
}