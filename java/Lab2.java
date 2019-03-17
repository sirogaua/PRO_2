import Out.Output;
import Inp.Input;
import Targ.Target;
import java.util.Scanner;

public class Lab2
{
	public static void main(String[] args)
    {
		final int n = 8;
		int masiv[][] = new int [n][n];
		int temp;
		System.out.printf("1. Random_masiv\n2. Sort_masiv\n3. Input_masiv\nChoose a mode: ");
		Scanner scan = new Scanner(System.in);
		temp = scan.nextInt();
		switch(temp)
        {
			case 1:
				System.out.println("Test: random masiv");
				Input.InputRandomMasiv(masiv, n);
				Output.OutputMasiv(masiv, n);
      			Target.TargetMasiv(masiv, n);
      			break;
      		case 2:
      			System.out.println("Test: sorted masiv");
      			Input.InputSortMasiv(masiv, n);
				Output.OutputMasiv(masiv, n);
      			Target.TargetMasiv(masiv, n);
      			break;
      		case 3:
      			System.out.println("Test: introduced masiv");
      			Input.InputMasiv(masiv, n);
				Output.OutputMasiv(masiv, n);
      			Target.TargetMasiv(masiv, n);
      			break;
      		default:
      			System.out.println("Test: introduced masiv");
				Input.InputMasiv(masiv, n);
				Output.OutputMasiv(masiv, n);
      			Target.TargetMasiv(masiv, n);
      			break;
		}
		
	}
}
