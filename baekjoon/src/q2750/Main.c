#include <stdio.h>

int main(void) {
    int testCase;
    scanf("%d", &testCase);
    int array[testCase];

    for (int i = 0; i < testCase; i++) {
        scanf("%d", &array[i]);
    }

    for (int i = testCase; i > 0; i--) {
        for (int j = 1; j < i; j++) {
            if (array[j-1] > array[j]) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
            }
        }
    }

    for (int i = 0;  i < testCase; i++) {
        printf("%d\n", array[i]);
    }

    return 0;
}