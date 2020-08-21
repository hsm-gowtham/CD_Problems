package ChellaDurai_Problems.Test_ques;

import java.util.*;

public class SortedPrime {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int temp=sc.nextInt();
			if(isprime(temp))
			{
				list.add(temp);
			}
		}
		Collections.sort(list);
		System.out.println(list);

	}

	private static boolean isprime(int temp) {
		int c=0;
		if(temp<=1) return false;
		for(int i=2;i<Math.sqrt(temp);i++)
		{
			if(temp%i==0)
			{
				return false;
			}	
		}
		return true;
		
	}

}
