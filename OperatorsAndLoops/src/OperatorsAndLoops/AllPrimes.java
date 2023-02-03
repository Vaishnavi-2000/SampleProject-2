package OperatorsAndLoops;

import java.util.Scanner;

public class AllPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
			System.out.println(2);
		for(int i=3;i<=n;i++)
		{
			int count=0;
			for (int j=2;j<i;j++)
			{
				if(i%j==0)
					count+=1;
			}
			if(count==0)
				System.out.println(i);
		}

	}

}
