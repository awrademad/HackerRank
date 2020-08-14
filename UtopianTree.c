#include <iostream>
using namespace std;

int height(int n) {
    int x = 1;
    if (n == 0)
        {return 1;}
    else if (n == 1)
        {return n+n;}
    else if (n > 1)
        {
        for (int i = 1; i <= n ; i= i+2)
            {
            x +=  x;
            if (n % 2 == 1 && i == n )
                {
                return x;
                }
            x = x + 1;
        
            }
            return x;
        }
    else
        
    return 0;
}
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        cout << height(n) << endl;
    }
}
