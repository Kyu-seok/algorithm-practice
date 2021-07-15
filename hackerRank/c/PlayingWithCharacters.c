#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    char c;
    char string[100], sen[100];

    scanf("%c", &c);
    scanf("%s", string);
    scanf("\n");
    scanf("%[^\n]%*c", sen);

    printf("%c\n%s\n%s\n", c, string, sen);
    
    return 0;
}