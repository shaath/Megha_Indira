
public class StringEg2 
{
	public static void main(String[] args) 
	{
		String s="QEdge";
		
		int len=s.length();
		
		System.out.println(len);
		
		System.out.println(s.charAt(2));
		
//		System.out.println(s.substring(1, 5));
		
		for (int i = 0; i < len; i++)
		{
			System.out.println(s.charAt(i));
			
		}
	}

}
