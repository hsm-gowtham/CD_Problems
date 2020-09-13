package Basics_Must_Know;

public class Palindrome {

	public static void main(String[] args) {
		String s="0110";
		int l=s.length()-1;
		int flag=0;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(l-i))
			{
				flag=1;
				break;
			}
				
		}
		if(flag==0) System.out.println("Palindrome");
		else	System.out.println("Not a Palindrome");
			

	}

}
