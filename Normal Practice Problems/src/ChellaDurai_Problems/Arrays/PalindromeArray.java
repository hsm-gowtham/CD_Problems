package ChellaDurai_Problems.Arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		int ar[]=new int[] {1,2,2,1};
		int n=ar.length-1;
		int flag=0;
		for(int i=0;i<=ar.length/2;i++)
		{
			if(ar[i]!=ar[n-i])
			{
				 flag = 1;
				 break;
			}
		}
		if(flag==0) System.out.print("Palindrome");
		else	System.out.print(" not Palindrome");
			
	}
}