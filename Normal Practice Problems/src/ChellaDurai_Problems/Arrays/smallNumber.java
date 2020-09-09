package ChellaDurai_Problems.Arrays;
import java.util.*;
public class smallNumber {

	public Integer smallNumberCheck(int i) {
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
		System.out.print(map);
		System.out.print(ans);
		return(Integer.parseInt(ans));
	}

}
