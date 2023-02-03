package OperatorsAndLoops;

import java.util.Scanner;

public class CheckAmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int pow=0,sum=0;
		while(temp>0)
		{
			temp=temp/10;
			pow++;
		}
		temp=n;
		while(temp>0)
		{
			int rem=temp%10;
			int num=rem,count=pow;
			while(count>1)
			{
				rem=rem*num;
				count--;
			}
			sum=sum+rem;
			temp=temp/10;
		}
		if(sum==n)
			System.out.println(true);
		else
			System.out.println(false);
			
	}

}
