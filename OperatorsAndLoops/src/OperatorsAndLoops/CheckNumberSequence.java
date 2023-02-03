package OperatorsAndLoops;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int curr=Integer.MAX_VALUE;
		int i=1,count=1,next=0;
		while(i<n)
		{
			next=sc.nextInt();
			if(curr>next)
			{
				curr=next;
				count++;
			}
			else 
				break;
			i++;
		}
		curr=next;
		while(i<n)
		{
			next=sc.nextInt();
			if(curr<next)
			{
				curr=next;
				count++;
			}
			else
				break;
			i++;
			
		}
		if(count==n)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
