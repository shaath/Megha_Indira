import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetEg1 {

	public static void main(String[] args) 
	{
		 Set<String> s=new HashSet<String>();
		 
		 //Writing the data 
		 
		 s.add("Selenium");
		 s.add("UFT");
		 s.add("Apple");
		 s.add("Selenium");
		 s.add("Bat");
		 
		 //Reading the data
		 Iterator<String> it=s.iterator();
		 
		 while (it.hasNext())
		 {
			String data=it.next();
			System.out.println(data);
		 }
		 
		 
	}

}
