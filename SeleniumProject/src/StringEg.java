
public class StringEg {

	public static void main(String[] args)
	{
		String c1="selenium";
		String c2="qwqwqwqw";
		
		System.out.println(c1.toUpperCase());
		System.out.println(c2.toUpperCase());
		
		if (c1.equalsIgnoreCase(c2)) 
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are Not same");
		}

	}

}
