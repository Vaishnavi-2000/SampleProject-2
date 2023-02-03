package OperatorsAndLoops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long sum=0,mul=1;
		while(n>0)
		{
			long rem=n%2;
			sum=sum+rem*mul;
			mul=mul*10;
			n=n/2;
			
		}
		System.out.println(sum);

	}

}
