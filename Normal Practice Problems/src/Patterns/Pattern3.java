/*
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
 */
package Patterns;
public class Pattern3 {

	public static void main(String[] args) {
		
		    int n=5,line,count;
		    for(line=1;line<=n;line++)
			{
			    for(count=1;count<=line;count++)
		        {
			    	System.out.print(line);
		            if(count!=line)
		            	System.out.print("*");
		        }
			    /*
			    for(count=1;count<=line;count++)
		        {
		            //print * before the number
		            if(count!=1)
		                printf("*");
		            printf("%d",line);
		        }
		        */
			    System.out.println();
			}
		    for(line=n;line>=1;line--)
			{
			    for(count=1;count<=line;count++)
		        {
			    	System.out.print(line);
		            if(count!=line)
		            	System.out.print("*");
		        }
			    /*
			    for(count=1;count<=line;count++)
		        {
		            //print * before the number
		            if(count!=1)
		                printf("*");
		            printf("%d",line);
		        }
		        */
			    System.out.println();
			}

}
}
