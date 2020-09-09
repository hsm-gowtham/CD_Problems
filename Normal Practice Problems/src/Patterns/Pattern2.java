/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
 */
package Patterns;
public class Pattern2 {

	public static void main(String[] args) {
		int n=5,i,j;
	    for(i=1;i<=n;i++)
		{
		    for(j=1;j<=2*n;j++)
	            if(i>(n-j+1) && (i+n)>j)
	            	System.out.print(" ");
	            else
	            	System.out.print("*");
		    System.out.println();
		}
	    for(i=1;i<=n;i++)
		{
		    for(j=1;j<=2*n;j++)
	            if(i<j && j<=2*n-i)
	            	System.out.print(" ");
	            else
	                System.out.print("*");
		    System.out.println();
		}

	}

}
