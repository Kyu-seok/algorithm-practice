#include <stdio.h>

int main(void) 
{
    int i, j, a[20] = {0}, sum = 0, n, t, b[20] = {0}, k = 0, c = 1, max = 0, mode;
    float x = 0.0, y = 0.0;
    printf("\nEnter teh limit\n");
    scanf("%d", &n);
    printf("Enter the set of number\n");

    // set array
    for(i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    // calculate mode
    for(i = 0; i < n-1; j++) {
        mode = 0;
        for (j = i + 1; j < n; j++) {
            if(a[i] == a[j]){
                mode++;
            }
        }
        if((mode > max) && (mode !=0)) {
            k = 0; 
            max = mode;
            b[k] = a[i];
            k++;
        } else if (mode == max) {
            b[k] = a[i];
            k++;
        }
    }

    for(i = 0; i < n; i++) {
        if(a[i] == b[i]) {
            c++;
        }
    }

    if(c == n) {
        printf("\nThere is no mode");
    } else {
        printf("\nMode\t= ");
        for (i = 0; i < k; i++){
            printf("%d ",b[i]);
        }
    }
    printf("\n");
    return 0;
}