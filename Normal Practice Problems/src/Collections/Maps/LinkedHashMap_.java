package Collections.Maps;

import java.util.*;


public class LinkedHashMap_ {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in); 
		int n=10;
		for(int i=0;i<n;i++) {
			int t=sc.nextInt();
			if(!map.containsKey(t))	map.put(t,1);
			else map.put(t, map.get(t)+1);
		}
		//System.out.println(map);
		for(Map.Entry<Integer,Integer> val:map.entrySet())
		{
			System.out.println(val.getKey()+" - "+val.getValue());
		}

		sc.close();
	}

}
