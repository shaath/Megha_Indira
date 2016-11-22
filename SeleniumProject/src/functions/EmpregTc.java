package functions;

import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class EmpregTc {

	public static void main(String[] args) 
	{
		OrgMAster om=new OrgMAster();
		
		String res=om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		Sleeper.sleepTightInSeconds(5);
		
		res=om.org_Empreg("Megha", "Megha");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
