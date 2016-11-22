
public class NestedIfEg 
{

	public static void main(String[] args) 
	{
		int a=5000;
		int b=50000;
		int c=500000;
		
		if (a>b & a>c) 
		{
			System.out.println("A is greater");
		}
		else if (b>c & b>a) 
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is greater "+ c);
			
		}

	}

}
