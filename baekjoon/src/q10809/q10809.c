#include <stdio.h>
#include <string.h>

int main()
{
    int checkLocation[26], i, j;
    char word[100];

    scanf("%s",word);

    for(i = 0; i < 26; i++) 
    {
        checkLocation[i] = -1;
    }

    for(i = 0; i < strlen(word); i++)
    {
        char alphabet = word[i];
        if(checkLocation[alphabet - 97] == -1)
        {
            checkLocation[alphabet - 97] = i;
        }
    } 
    for (j = 0; j < 26; j++) 
    {
        printf("%d\n",checkLocation[j]);
    }


    return 0;
}