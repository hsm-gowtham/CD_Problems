package ChellaDurai_Problems.Arrays;

import java.util.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Multiple_indexing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		//int a[]=new int[] {600 300 600 200 300 200 200 300}
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			if(!map.containsKey(num))
			{
				map.put(num, " "+i);
			}
			else
			{
				map.put(num, map.get(num)+","+i);
			}
			
		}
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey() + ": ["+m.getValue()+"]");
		}
		sc.close();
	}

}
/*
 input:
 8
600 300 600 200 300 200 200 300
output:
600: [ 0,2]
200: [ 3,5,6]
300: [ 1,4,7]
*/
