package Test1;

import java.util.Scanner;

public class checkSequence {

	
	public static boolean checkSequence(String str1, String str2) {
		boolean ans=false;
		int prev=Integer.MIN_VALUE;
		for(int i=0;i<str2.length();i++)
		{
			int j=0;
			for(;j<str1.length();j++)
			{
				if(str2.charAt(i)==str1.charAt(j))
				{
					if(prev>j)
						ans=false;
					else
						ans=true;
					break;
				}
			}
			prev=j;
		}
		return ans;

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String large = s.nextLine();
		String small = s.nextLine();
		System.out.println(checkSequence(large, small));
	}

}
