#include "typedef.h"

void rand_masiv(int **masiv)
{
    for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
                {
                    masiv[i][j] = rand() %100 - 50;
                }
        }
}

void sort_masiv(int **masiv)
{
    for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
                {
                    masiv[i][j] = -i + j;
                }
        }
}

void input_masiv(int **masiv)
{
    for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
                {
                    printf("masiv[%i][%i] = ", i, j);
                    scanf("%d", &masiv[i][j]);
                }
        }
}
