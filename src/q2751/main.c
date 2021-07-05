#include <stdio.h>

int main(void) 
{
    int testCase;
    scanf("%d", &testCase);
    int arr[testCase];

    for(int i = 0; i < testCase; i++) {
        scanf("%d", &arr[i]);
    }

    for (int i = testCase; i > 0; i--) {
        for(int j = 1; j < i; j++) {
            if(arr[j-1] > arr[j]) {
                for(int k = j; k > 0; k--) {
                    int temp = arr[k];
                    arr[k] = arr[k-1];
                    arr[k-1] = temp;
                }
            }
        }
    }

    for (int i = 0; i < testCase; i++) {
        printf("%d\n", arr[i]);
    }

    return 0;
}