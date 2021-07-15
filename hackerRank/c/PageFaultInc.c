#include <stdio.h>
#include <time.h>

int main(void)
{
    int arr[1000][1000];
    clock_t start1, start2, end1, end2;

    start1 = clock();
    for(int i = 0; i < 1000; i++) {
        for (int j = 0; j < 1000; j++) {
            arr[i][j] = 1;
        }
    }
    end1 = clock();

    start2 = clock();
    for(int i = 0; i < 1000; i++) {
        for (int j = 0; j < 1000; j++) {
            arr[j][i] = 1;
        }
    }
    end2 = clock();

    double time1, time2;

    time1 = ((double) (end1 - start1)) / CLOCKS_PER_SEC;
    time2 = ((double) (end2 - start2)) / CLOCKS_PER_SEC;

    printf("Time taken in first method (low page fault): %f\n", time1);
    printf("Time taken in second method (high page fault): %f\n", time2);

    printf("Computation causing page fault is %.1f times slower than not\n", time2/time1);

}