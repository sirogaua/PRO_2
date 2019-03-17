#include "typedef.h"

int main()
{
	int **masiv;

	masiv = (int**) malloc(sizeof(int *) * n);

	for( i = 0; i < n; i++)
        {
            masiv[i]=(int *)malloc(sizeof(int)*n);
        }
	
	int temp;
	printf("1. Random masiv\n2. Sorted masiv\n3. Input masiv\nChoose a mode: ");
	scanf("%d", &temp);
	
	switch(temp){
	
		case 1:
		printf("Test: random masiv\n");
		rand_masiv(masiv);
        output_masiv(masiv);
        target_masiv(masiv);
		break;
	
		case 2:
		printf("Test: sorted masiv\n");
		sort_masiv(masiv);
        output_masiv(masiv);
        target_masiv(masiv);
		break;
	
		case 3:
		printf("Test: intput masiv\n");
		input_masiv(masiv);
        output_masiv(masiv);
        target_masiv(masiv);
		break;
	
		default:
		printf("Test: intput masiv\n");
		input_masiv(masiv);
        output_masiv(masiv);
        target_masiv(masiv);
		break;
	}
}
