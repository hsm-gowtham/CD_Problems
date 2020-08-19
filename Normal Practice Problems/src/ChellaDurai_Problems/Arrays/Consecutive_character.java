/*
input: 
ABCEFGZAC
output:
ABC
EFG
ZA
 */
package ChellaDurai_Problems.Arrays;

import java.util.Scanner;

public class Consecutive_character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans="";
		for(int i=1;i<s.length();i++)
		{
			if(conti(s.charAt(i-1),s.charAt(i)))
			{
				if(ans.isEmpty()) 	ans=ans+s.charAt(i-1)+s.charAt(i);
				else	ans=ans+s.charAt(i);
			}
			else
			{
				System.out.println(ans);
				ans="";
			}
			
		}
		sc.close();
		

	}

	private static boolean conti(char a, char b) {
		if(a=='Z'&&b=='A') return true;
		if(b-a==1) return true;
		return false;
	}

}
