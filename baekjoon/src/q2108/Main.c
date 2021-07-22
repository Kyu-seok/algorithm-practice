#include <stdio.h>
#include <math.h>

int main(void)
{
    int n;
    scanf("%d", &n);

    int arr[n];

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    // quick sort
    if (n > 1)
    {
        for (int i = n; i > 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // total sum
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += arr[i];
    }

    // find number of types
    int types = 1;

    for (int i = 0; i < n - 1; i++)
    {
        if (arr[i] != arr[i + 1])
        {
            types++;
        }
    }

    // construct frequency table
    int table[types][2];
    int k = 0;
    for (int i = 0; i < n; i++)
    {
        if (k == 0)
        {
            table[k][0] = arr[i];
            k++;
        }
        else
        {
            if (table[k - 1][0] != arr[i])
            {
                table[k][0] = arr[i];
                k++;
            }
        }
    }
    for (int i = 0; i < types; i++)
    {
        table[i][1] = 0;
    }

    k = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == table[k][0])
        {
            table[k][1]++;
        }
        else
        {
            k++;
            table[k][1]++;
        }
    }



    // find maximum number of frequecy from table
    int max_freq = 0;
    for (int i = 0; i < types; i++)
    {
        if (table[i][1] > max_freq)
        {
            max_freq = table[i][1];
        }
    }

    // calculate if there is multiple number of max frequncy
    int modes = 0;
    for (int i = 0; i < types; i++)
    {
        if (table[i][1] == max_freq)
        {
            modes++;
        }
    }

    int hasMultipleMode = 0;

    int arrMode[modes];
    if (modes > 1)
    {
        k = 0;
        for (int i = 0; i < types; i++)
        {
            if (table[i][1] == max_freq)
            {
                arrMode[k] = table[i][0];
                k++;
            }
        }
    }


    //int mean = round((double)sum / (double)n);
    double avg = (double)sum / n;
    int mean = round(avg);
    int median = arr[(n / 2)];
    int mode;

    if(n == 1) {
        mode = arr[0];
    }else if (modes == 1)
    {
        for (int i = 0; i < types; i++)
        {
            if (table[i][1] == max_freq)
            {
                mode = table[i][0];
            }
        }
    }
    else
    {
        mode = arrMode[1];
    }

    int range;
    if(n == 1) {
        range = 0;
    }else {
        range = arr[n - 1] - arr[0];
    }

    printf("%d\n", mean);
    printf("%d\n", median);
    printf("%d\n", mode);
    printf("%d\n", range);



   
    return 0;
}