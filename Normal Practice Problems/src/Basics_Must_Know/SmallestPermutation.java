package Basics_Must_Know;

public class SmallestPermutation {
	public static void main(String args[]) {
		int hash[]=new int[10];
		int N=5300242;
	    while(N!=0)
	    {
	        hash[N%10]++;
	        N/=10;
	    }
	    int i=1;
	    while(hash[i]==0)
	    {
	        i++;
	    }
	    System.out.print(i);
	    hash[i]--;
	    i=0;
	    // 0 1 2 3 4 5 6 7 8 9 
	    while(i<10)
	    {
	        for(int j=0;j<hash[i];j++)
	        {
	        	System.out.print(i);
	        }
	        i++;
	    }
		
	}

}
