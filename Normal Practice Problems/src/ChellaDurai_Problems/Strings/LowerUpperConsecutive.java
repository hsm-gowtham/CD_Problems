package ChellaDurai_Problems.Strings;
import java.util.*;
public class LowerUpperConsecutive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Character> l=new ArrayList<Character>();
		String s=sc.next();	//aTBbtA
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
			l.add(ch[i]);
		Collections.sort(l);
		String rem="";
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			if(Character.isLowerCase(l.get(i)))
			{	
				if(l.contains(Character.toUpperCase(l.get(i))))
					System.out.print(l.get(i)+""+Character.toUpperCase(l.get(i)));
				else
					rem+=String.valueOf(l.get(i));
			}
		}
		System.out.print(rem);
		sc.close();
	}

}
