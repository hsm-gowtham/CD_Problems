package ChellaDurai_Problems.Arrays;
import java.util.*;
public class twoDList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<List<Integer>> a=new ArrayList<List<Integer>>();
	
		int r=2,c=3;
		for(int i=0;i<r;i++)
		{ List<Integer> list=new ArrayList<Integer>();
			for(int j=0;j<c;j++)
			{
				list.add(sc.nextInt());
			}
			a.add(list);
			
		}
		System.out.println(a);
		for(List<Integer> i:a)
		{
			for(Integer j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
