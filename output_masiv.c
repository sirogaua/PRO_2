#include "typedef.h"

void output_masiv(int **masiv)
{
    for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
                {
                   printf("%5d", masiv[i][j]);
                }
            printf("\n");
        }
     printf("\n");
}
