package Inp;
import static java.lang.Math.*;
import java.util.Scanner;

public class Input 
{
	public static void InputRandomMasiv(int masiv[][], int n)
    {
		for (int i = 0; i < n; i++)
        {
			for(int j = 0; j < n; j++)
            {
				masiv[i][j] = ((int)((random()*1000)%70 ));
            }
        }	
	}

	public static void InputSortMasiv(int masiv[][], int n)
    {
		for (int i = 0;i < n; i++)
        {
			for(int j = 0; j < n; j++)
            {
				masiv[i][j] = -i + j;
            }
        }
	}

	public static void InputMasiv(int masiv[][], int n)
    {
		Scanner scan = new Scanner(System.in);

		for (int i=0;i<n;i++)
        {
			for(int j=0;j<n;j++)
            {
				masiv[i][j]=scan.nextInt();
            }
        }
	}
}
