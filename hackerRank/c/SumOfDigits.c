#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
    scanf("%d", &n);

    int sum = ( (n % 100000) / 10000)  + ( (n % 10000) / 1000) + ( (n % 1000) / 100) + ( (n % 100) / 10) + ( (n % 10)  ); 
    printf("%d", sum);
    return 0;
}