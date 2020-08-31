package ChellaDurai_Problems.Arrays;

import java.util.*;

public class VowelAndCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		int v=sc.nextInt();
		int c=sc.nextInt();
		List<Character> vowel=new ArrayList<Character>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		char ch[]=s.toCharArray();
		String vs="",nvs="";
		for(int i=0;i<ch.length;i++)
		{
			if(vowel.contains(ch[i]))
			{
				vs+=String.valueOf(ch[i]);
			}
			else
			{
				nvs+=String.valueOf(ch[i]);
			}
		}
		if(c==0)
		{
			if(v==0)
			{
				System.out.println(nvs.toLowerCase());
			}
			else
			{
				System.out.println(vs.toLowerCase());
			}
		}
		else
		{
			if(v==0)
			{
				System.out.println(nvs.toUpperCase());
			}
			else
			{
				System.out.println(vs.toUpperCase());
			}
		}
		

	}

}
