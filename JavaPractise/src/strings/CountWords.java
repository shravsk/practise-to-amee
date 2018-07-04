package strings;

import java.util.Scanner;

public class CountWords 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		String orgStr=str.trim();
		
		int count=1;
		int len=orgStr.length();
		for(int i=0;i<len;i++)
		{
				if(str.charAt(i)==' ')
				{
					count++;
				}
		}
		System.out.println("Total no. of words : "+count);
	}

}
