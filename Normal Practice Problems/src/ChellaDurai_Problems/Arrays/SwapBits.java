package ChellaDurai_Problems.Arrays;
import java.util.*;
public class SwapBits
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String bin = Integer.toBinaryString(a);
	int len=bin.length();
	String ans="";
	if(len%2!=0) bin="0"+bin;
	len=bin.length();
	System.out.println(bin);
	for(int i=len-1;i>=0;i=i-2)
	{
		if(bin.charAt(i)=='1'&&bin.charAt(i-1)=='1')
		{
			ans+=String.valueOf(bin.charAt(i))+String.valueOf(bin.charAt(i-1));
		}
		else{
			ans+=String.valueOf(bin.charAt(i-1))+String.valueOf(bin.charAt(i));
		}
	}
	StringBuilder sb=new StringBuilder();
	sb.append(ans);
	sb=sb.reverse();
	
	
	System.out.println(ans);
	System.out.println(sb);
	System.out.println(Integer.parseInt(String.valueOf(sb),2));
	sc.close();
}
}
