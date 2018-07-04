package pattern;

public class Pattern1 
{
	public static void main(String[] args) 
	{
		int lines=5;
		int space=lines/2;
		int star=1;
		
		for(int i=0;i<lines;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<star;k++)
			{
				if(k==0 || k==star-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
			
			if(i<lines/2)
			{
				space--;
				star+=2;
				
			}
			else
			{
				space++;
				star-=2;
			}
		}
	}

}
