
public class DoWhileLoop {

	public static void main(String[] args) 
	{
		int i=1;
		
		do 
		{
			System.out.println(i);
			if (i==47)
			{
				break;
			}
			i++;
		}
		while (i<=100);
	}

}
