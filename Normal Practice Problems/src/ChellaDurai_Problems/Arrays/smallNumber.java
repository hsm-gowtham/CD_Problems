package ChellaDurai_Problems.Arrays;
import java.util.*;
public class smallNumber {

	public static void main(String args[]) {
		int i=532300;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		while(i!=0)
		{
			if(map.containsKey(i%10))
				map.put(i%10,map.get(i%10)+1);
			else
				map.put(i%10,1);
			i/=10;
		}
		String ans="";
		for(Map.Entry<Integer, Integer> val:map.entrySet())
		{
			for(int j=0;j<val.getValue();j++)
			{
				ans+=String.valueOf(val.getKey());
			}
		}
		System.out.println(map);
		System.out.println(ans);
		System.out.println(Integer.parseInt(ans));
	}

}
