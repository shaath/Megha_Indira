
public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] s=new Object[20];
		
		// length of the array
		
		System.out.println(s.length);

		// Writing the data into array
		
		s[2]=30000;
		
		s[4]="Selenium";
		
		s[6]="Megha";
		
		s[6]="Sharath";
		
		s[8]="Indira";
		
//		s[21]="Sharath";
		
		//Reading the data from array
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
			
		}
		
	}

}
