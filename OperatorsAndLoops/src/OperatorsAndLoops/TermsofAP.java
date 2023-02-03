package OperatorsAndLoops;

import java.util.Scanner;

public class TermsofAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		int i=1;
		while(count<=n)
		{
			int ap=3*i+2;
			if(ap%4!=0)
			{
				
				System.out.print(ap+" ");
				count++;
				
			}
			i++;
			
		}
		
			
	
	}

}
