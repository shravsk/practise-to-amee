package strings;

import java.util.Scanner;

public class RemoveParticularCharacter
{
	public static void main(String[] args)
	{
		String newStr="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		System.out.println("Enter the character to be removed");
		char ch=sc.next().charAt(0);
		
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)!=ch)
			{
				newStr=newStr+str.charAt(i);
			}
		}
		System.out.println("New string : "+newStr);
		

	}

}
