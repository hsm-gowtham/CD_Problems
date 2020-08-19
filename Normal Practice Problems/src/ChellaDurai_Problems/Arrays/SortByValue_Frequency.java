package ChellaDurai_Problems.Arrays;
import java.util.*;
import java.util.Map;
public class SortByValue_Frequency {
	static Map<Character,Integer> map=new HashMap<Character,Integer>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SortByValue_Frequency sv=new SortByValue_Frequency();
		String s="abcbbabbbbcbsccc";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(!map.containsKey(ch[i]))
			{
				map.put(ch[i],1);
			}
			else
			{
				map.put(ch[i],map.get(ch[i])+1);
			}
		}
		System.out.println(map);
		System.out.println("Ascending Order");
		sv.sortbyvalue(true);
		System.out.println("descending Order");
		sv.sortbyvalue(false);
		
		sc.close();
	}
	private void sortbyvalue(boolean order) {
		List<Map.Entry<Character,Integer>> list=new LinkedList<Map.Entry<Character,Integer>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>()
		{
			public int compare(Map.Entry<Character,Integer>o1,Map.Entry<Character,Integer>o2)
			{
				if(order)
					return(o1.getValue().compareTo(o2.getValue()));
				else
					return(o2.getValue().compareTo(o1.getValue()));
			}
		});
		Map<Character,Integer> sortedmap=new LinkedHashMap<Character,Integer>();
		for(Map.Entry<Character, Integer> entry:list)
		{
			sortedmap.put(entry.getKey(),entry.getValue());
		}
		System.out.println(sortedmap);
		System.out.println("Highest Repeated Value Is");
		int maxValueInMap=(Collections.max(sortedmap.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Character, Integer> entry : sortedmap.entrySet()) 
        {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
		
        }
        System.out.println("java 1.8 One Line Method");
        Character  max_key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(max_key);
        }
	}


