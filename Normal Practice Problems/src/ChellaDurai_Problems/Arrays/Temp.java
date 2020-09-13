package ChellaDurai_Problems.Arrays;

import java.util.*;

public class Temp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int ub=0,lb=n-1,r=n-1,l=0,val=1;
		sc.close();
		while(l<=r)
		{
			for(int col=l;col<=r;col++)
			{
				a[ub][col]=val++;
			}
			ub++;
			for(int row=ub;row<=r;row++)
			{
				a[row][r]=val++;
			}
			r--;
			for(int col=r;col>=l;col--)
			{
				a[lb][col]=val++;
			}
			lb--;
			for(int row=lb;row>=ub;row--)
			{
				a[row][l]=val++;
			}
			l++;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
