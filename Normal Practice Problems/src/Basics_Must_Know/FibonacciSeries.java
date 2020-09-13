package Basics_Must_Know;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=10;
		int a=0,b=1,c=0;
		System.out.print(0+" ");
		System.out.print(1+" ");
		
		while(n-2!=0)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			n--;
		}
		
	}

}
