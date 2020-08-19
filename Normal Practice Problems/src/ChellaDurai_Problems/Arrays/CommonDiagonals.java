package ChellaDurai_Problems.Arrays;

import java.util.Scanner;

public class CommonDiagonals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=6;
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int i=0,j=n-1,k=1;System.out.print(a[0][0]+" ");
		while((i+k)<n&&(j-k)>=0)
		{
			if(a[i][j]==a[i+k][j-k])
			{
				k++;
			}
			if(k==j+1)
			{
				System.out.print(a[i][j]+" ");
				j--;k=1;
			}
			else
			{
				j--;
				k=1;
			}
			
		}
		
		 i=n-1;j=1;k=1;
		while((j+k)<n&&(i-k)>=0)
		{
			if(a[i][j]==a[i-k][j+k])
			{
				k++;
			}
			if(k==n-j)
			{
				System.out.print(a[i][j]+" ");
				j++;k=1;
			}
			else
			{
				j++;
				k=1;
			}
			
		}
		System.out.print(a[n-1][n-1]);
		sc.close();
	}

}
/* input:
 1 2 3 4
2 3 4 5
3 4 1 6
4 1 6 7
outputs:
1 4 3 2 6 7*/
/* input
 1 2 3 4 6 7
2 3 4 6 7 1
3 4 6 7 0 1
4 6 7 0 0 1
6 7 0 0 0 1
7 0 0 0 0 1
output:
1 7 6 4 3 2 1
*/
