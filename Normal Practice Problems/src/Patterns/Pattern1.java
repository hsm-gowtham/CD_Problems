/*
123456654321
12345**54321
1234****4321
123******321
12********21
1**********1
 */

package Patterns;
public class Pattern1 {
	public static void main(String[] args) {
		int rows=6,i,j;
	    for(i=rows;i>=1;i--)
	    {
	        for(j=1;j<=rows;j++)//left
	        {
	            if(j<=i)
	                System.out.print(j);
	            else
	            	System.out.print("*");
	        }
	        for(j=rows;j>=1;j--)//right
	        {
	            if(i>=j)
	            	System.out.print(j);
	            else
	            	System.out.print("*");
	        }
	        System.out.println();
	    }

	}

}
