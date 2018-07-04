package strings;

public class D 
{
	public void finalize()
	{
		System.out.println("finalize called");
	}  
	public static void main(String[] args)
	{  
		D f1=new D();  
		D f2=new D(); 
		f1=null;  
		f2=null;  
		System.gc(); 
	}
}
