package Collections.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class KeyWith2ndMaxFreq {
	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in); 
		int n=10;
		int max=-999,max_key=-999,Secondmax=0;
		for(int i=0;i<n;i++) {
			int t=sc.nextInt();
			if(!map.containsKey(t)) {
				map.put(t,1);
			}
			else {
				map.put(t, map.get(t)+1);
				if(map.get(t)>=max) 
					{	
						max=map.get(t);
						if(t>max_key) {
							Secondmax=max_key;
							max_key=t;
						}						
					}
			}
		}
		//System.out.println(map);
		for(Map.Entry<Integer,Integer> val:map.entrySet())
		{
			System.out.println(val.getKey()+" - "+val.getValue());
		}
		System.out.println("Key With Highest Frequency : "+max_key);
		System.out.println("Key With Second Highest Frequency : "+Secondmax);

		sc.close();

	}

}
