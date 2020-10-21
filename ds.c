#include <stdio.h>
#include <stdlib.h>
int main()
{

    void Binary(int n)
    {
        int A[n];
        if (n < 1)
        {
            for (int i = 0; i < n; i++)
                printf("%d", A[i]);
        }
        else
        {
            A[n - 1] = 0;
            Binary(n - 1);
            A[n - 1] = 1;
            Binary(n - 1);
        }
    }
    Binary(3);
    return 0;
}