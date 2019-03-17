package Targ;

import Out.Output;

public class Target
{
	public static void TargetMasiv(int masiv[][], int n)
    {
	int last_dd = 0;
    int first_pp = 0;
    int i_first_pp = 0;
    int j_first_pp = 0;
    int i_last_dd = 0;
    int j_last_dd = 0;
    int buff;
    int i, j;
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
        System.out.printf("last negativ: masiv[%d][%d] = %d", i_last_dd, j_last_dd, masiv[i_last_dd][j_last_dd]);
        System.out.println();
        System.out.printf("first positiv: masiv[%d][%d] = %d", i_first_pp, j_first_pp, masiv[i_first_pp][j_first_pp]);
        System.out.println();
        buff = masiv[i_last_dd][j_last_dd];
        masiv[i_last_dd][j_last_dd] = masiv[i_first_pp][j_first_pp];
        masiv[i_first_pp][j_first_pp] = buff;
        Output.OutputMasiv(masiv, n);
    }
    else
    {
        if(first_pp == 0)
        {
            System.out.printf("No one positiv number!");    
        }
     
         if(last_dd == 0)
         {
             System.out.printf("No one negativ number!"); 
         }
            
 
    }
    }
}	
