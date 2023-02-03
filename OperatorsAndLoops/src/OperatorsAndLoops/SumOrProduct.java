package OperatorsAndLoops;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		if(c==1) {
			System.out.print(n*(n+1)/2);
		}
		else if(c==2)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
				fact=fact*i;
			System.out.println(fact);
			
		}
		else
			System.out.println(-1);
			
	}

}
