import java.util.ArrayList;


public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<String> s=new ArrayList<String>();
		
		//Writing the data into array list
		
		s.add("Sharath");
		s.add("Selenium");
		s.add(2,"Trainer");
		s.add("20000");
		

		System.out.println(s.size());
		
		for (int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
		}
	}

}
