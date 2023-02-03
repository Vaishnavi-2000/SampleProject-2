package OperatorsAndLoops;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int next=0;
		if(n==0)
			System.out.println(0);
		if(n==1)
			System.out.println(1);
		for(int i=0;i<n/2;i++)
		{
			int curr=next;
			next=next+2*(i+1)+1;
			if (n>curr && n<=next)
			{
				System.out.println(i+1);
				break;
			}
		}
		

	}

}
