package Basics_Must_Know;
import java.util.*;


public class Pangram {

	public static void main(String[] args) {
		String s="abcd efghi jklmn opqrstu vwxyz";
		s=s.toLowerCase();
		int h[]=new int[27];
		String ch[]=s.split(" ");
		for(int i=0;i<ch.length;i++)
		{
			//System.out.println(ch[i]);
			String t=ch[i];
			char[] a=t.toCharArray();
			for(int j=0;j<a.length;j++)
			{	//System.out.print((a[j]-96)+" ");
				h[a[j]-96]++;
				
			}
		}
		//System.out.println();
		int flag=0;
		for(int i=1;i<h.length;i++)
		{
			if(h[i]==0) {
				flag=1;
			break;}
		}
		if(flag==1)
			System.out.println("Not a Pangram");
		else
			System.out.println("Pangram");

	}

}
