package ChellaDurai_Problems.Arrays;
import java.util.*;
public class OddEvenConsecutive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> even=new ArrayList<Integer>();
		List<Integer> odd=new ArrayList<Integer>();	
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			if(temp%2==0)	even.add(temp);
			else odd.add(temp);
		}
		Collections.sort(even);
		Collections.sort(odd);
		for(Integer i: odd)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		for(Integer i: even)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		int el=even.size();
		int ol=odd.size();
		if(el-ol>0)
		{
			for(int i=0;i<el-ol;i++)	odd.add(0);
		}
		else if(ol-el>0)
		{
			for(int i=0;i<ol-el;i++)	even.add(0);
		}
		for(int i=0;i<odd.size();i++)
		{
				System.out.print(odd.get(i)+" ");
			System.out.print(even.get(i)+" ");
		}			
		sc.close();
	}
}
/*
input:
8
24 1 6 11 5 2 20 18
ouput:
1 5 11 
2 6 18 20 24 
1 2 5 6 11 18 0 20 0 24 
*/