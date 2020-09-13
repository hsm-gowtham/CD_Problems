package Basics_Must_Know;

import java.util.*;

public class NthFibonacciFormula {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=7;
		int ans=((int)Math.pow(((1+(int)(Math.sqrt(5)))/2f), n)-(int)Math.pow(((1-(int)(Math.sqrt(5)))/2f), n))/((int)Math.sqrt(5));
		System.out.println(ans);
		sc.close();

	}

}
