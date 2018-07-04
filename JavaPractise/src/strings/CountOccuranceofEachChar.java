package strings;

import java.util.Scanner;

public class CountOccuranceofEachChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			System.out.println("Occurance of "+ch[i]+"is : "+count);
		}
		System.out.println();

	}

}
