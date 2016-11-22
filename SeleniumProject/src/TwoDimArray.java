
public class TwoDimArray {

	public static void main(String[] args) 
	{
		Object[][] x=new Object[2][3];
		
		//finding the size of the rows
		
		System.out.println("Number of Rows are: "+x.length);
		
		// finding the length of the columns
		
		System.out.println("Number of Columns are: "+x[0].length);
		
		//Writing the values into array
		
		x[0][1]="Sharath";
		x[1][2]="Trainer";
		
		System.out.println(x[0][1]);
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++)
			{
				System.out.println(x[i][j]);
				
			}
			
		}
	}

}
