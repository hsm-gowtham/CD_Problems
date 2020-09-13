package Collections.Maps;

import java.util.*;

public class TreeMap_ {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in); 
		int n=10;
		for(int i=0;i<n;i++) {
			int t=sc.nextInt();
			if(!map.containsKey(t))	map.put(t,1);
			else map.put(t, map.get(t)+1);
		}
		System.out.println(map);
		for(Map.Entry<Integer,Integer> val:map.entrySet())
		{
			System.out.println(val.getKey()+" - "+val.getValue());
		}
		Integer  max_key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		System.out.println(" Highest Key Element : "+max_key);
		System.out.println(map.values());

		sc.close();
	}

}
