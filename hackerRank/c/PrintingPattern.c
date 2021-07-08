#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int number;
    scanf("%d", &number);
    int n = (number * 2) - 1;
    int arr[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            arr[i][j] = 0;
        }
    }
    arr[number-1][number-1] = 1;

    for(int i = 1; i < n; i++) {
        //fill up upper box
        for(int j = i; j < n-i; j++) {
            arr[i-1][j] = number-i+1; 
            arr[n-i][j] = number - i + 1;
            arr[j][i-1] = number - i + 1;
            arr[j][n-i] = number - i + 1;
        }

    }

    for(int i = 1; i < number; i++) {
        arr[i - 1][i - 1] = number - i + 1;
        arr[n - i][i - 1] = number - i + 1;
        arr[i - 1][n - i] = number - i + 1;
        arr[n - i][n - i] = number - i + 1;
    }

    //printing array
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("%d ",arr[i][j] );
        }
        printf("\n");
    }
    return 0;
}