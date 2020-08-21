package ChellaDurai_Problems.Strings;

import java.util.*;
public class Letter2dIndexing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Character,String>map=new LinkedHashMap<Character,String>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				char temp=sc.next().charAt(0);
				if(!map.containsKey(temp))
				{
					String s="("+i+","+j+")";
					map.put(temp, s);
				}
				else
				{
					String s="("+i+","+j+")";
					map.put(temp, map.get(temp)+s);
				}
			}
		}
		for(Map.Entry<Character,String> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"="+"["+entry.getValue()+"]");
		}
		sc.close();

	}

}
