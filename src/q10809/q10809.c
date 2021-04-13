#include <stdio.h>

int main()
{
    char number[100];
    scanf("%s", number);

    int n = sizeof(number);

    printf("%d", n);

    return 0;
}