
public class SwitchCase {

	public static void main(String[] args) 
	{
		String course="Selenium";
		
		switch (course)
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "Manual":	
			System.out.println("You are selected Manual");
			break;
		case "Uft":	
			System.out.println("You are selected UFT");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
