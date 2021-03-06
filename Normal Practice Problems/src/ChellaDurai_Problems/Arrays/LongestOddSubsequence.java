package ChellaDurai_Problems.Arrays;

import java.util.*;

public class LongestOddSubsequence {

	
	public Integer oddSequenceSum(int a[]) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		int len=0,sum=0,maxlen=-99,ans=0;
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			if(num%2!=0)
			{
				len++;
				sum+=num;
			}
			else
			{
				if(!map.containsKey(len))
						{
					map.put(len,sum);
						}
				else
				{
					map.put(len,map.get(len)+sum);
				}
				if(len>=maxlen) {
					maxlen=len;
					ans=map.get(len);
				}
				len=0;
				sum=0;
				
			}
		
		System.out.println("Maxlength: "+maxlen+" Sum = "+ans);
		System.out.println(map);
		}
		return ans;
}

	
}
		/*TreeMap<Integer, Integer> sorted = new TreeMap<>(); 
		  
 
        sorted.putAll(map);
        System.out.println(sorted);
        System.out.println( 
                "Entry with highest key: "
                + getMaxEntryInMapBasedOnKey(map)); 
		
		sc.close();

	}
	 public static <K extends Comparable<K>, V> Map.Entry<K, V> 
     getMaxEntryInMapBasedOnKey(Map<K, V> map) 
     { 

         Map.Entry<K, V> entryWithMaxKey = null; 
         for (Map.Entry<K, V> currentEntry : map.entrySet()) { 
   
             if ( 
   
             
                 entryWithMaxKey == null
  
                 || currentEntry.getKey() 
                            .compareTo(entryWithMaxKey.getKey()) 
                        > 0) { 
   
                 entryWithMaxKey = currentEntry; 
             } 
         } 

         return entryWithMaxKey; 
     } 


}*/