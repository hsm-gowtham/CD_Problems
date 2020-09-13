package Basics_Must_Know;

public class NthFibonacci {

	public static void main(String[] args) {
		int n=5;
	    int ans=fib(n);
	    System.out.println(ans);
	}
	public static int fib(int num)
	{
	    if(num==0||num==1) return 1;
	    else
	    return (fib(num-1)+fib(num-2));
	}


}
