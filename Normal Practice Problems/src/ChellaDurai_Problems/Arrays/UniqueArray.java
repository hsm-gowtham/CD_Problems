package ChellaDurai_Problems.Arrays;

import java.util.*;

public class UniqueArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashSet<Integer> ts=new LinkedHashSet<Integer>();
		for(int i=0;i<10;i++)
		{
			ts.add(sc.nextInt());
		}
		System.out.println(ts);
		sc.close();

	}

}
