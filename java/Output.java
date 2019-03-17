package Out;

public class Output
{
	public static void OutputMasiv(int masiv[][], int n)
    {
		for(int i = 0; i < n; i++)
        {
			for(int j = 0; j < n; j++)
            {
				System.out.format("%5d", masiv[i][j]);	
            }
			System.out.println();	
		}
        System.out.println();
	}
}
