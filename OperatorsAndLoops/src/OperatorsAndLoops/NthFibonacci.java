package OperatorsAndLoops;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f1=1;
		int f2=2;
		int fn=0;
		for(int i=3;i<n;i++)
		{
			fn=f1+f2;
			f1=f2;
			f2=fn;
			
		}
		System.out.println(fn);

	}

}
