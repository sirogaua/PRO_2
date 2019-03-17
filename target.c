#include "typedef.h"

void target_masiv(int **masiv)
{
    last_dd = 0;
    first_pp = 0;
    for(i = 0; i < n; i++)
        {
            if(masiv[n - i - 1][i] < 0)
            {
                last_dd = masiv[n - 1 - i][i];
                i_last_dd = n - 1 - i;
                j_last_dd = i;
            }
        }
    for(i = 0; i < n; i++)
        {
            if(masiv[n - 1 - i][i] > 0)
            {
                first_pp = masiv[n - 1 - i][i];
                i_first_pp = n - 1 - i;
                j_first_pp = i;
                break;
            }
        }
    if((first_pp != 0) && (last_dd != 0))
    {
        printf("last negativ: masiv[%d][%d] = %d", i_last_dd, j_last_dd, masiv[i_last_dd][j_last_dd]);
        printf("\n");
        printf("first positiv: masiv[%d][%d] = %d", i_first_pp, j_first_pp, masiv[i_first_pp][j_first_pp]);
        printf("\n");
        buff = masiv[i_last_dd][j_last_dd];
        masiv[i_last_dd][j_last_dd] = masiv[i_first_pp][j_first_pp];
        masiv[i_first_pp][j_first_pp] = buff;
        output_masiv(masiv);
    }
    else
    {
        if(first_pp == 0)
        {
            printf("No one positiv number!");    
        }
     
         if(last_dd == 0)
         {
             printf("No one negativ number!"); 
         }
            
 
    }
}
