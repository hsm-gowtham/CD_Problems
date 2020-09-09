/*
3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 

 */
package Patterns;
public class Pattern5 {

	public static void main(String[] args) {
		int n=3;
		int size = 2 * n - 1;
		int arr[][]=new int[size][size];
		int i,j;    
		int u=0,l=0,b=size,r=size,val=n;
		while(l<r && u<b)
		{
			for(i=l;i<r;i++)
			{
				arr[u][i]=val;
			}
			u++;
			for(i=u;i<b;i++)
			{
				arr[i][r-1]=val;
			}
			r--;
			for(i=r-1;i>=l;i--)
			{
				arr[b-1][i]=val;
			}
			b--;
			for(i=b-1;i>=u;i--)
			{
				arr[i][l]=val;
			}
			l++;
			val--;
		}
		for(i=0;i<size;i++)
		{
		 for(j=0;j<size;j++) {
			 System.out.print(arr[i][j]+" ");
		}
	        System.out.println();
	}

	}
}


