package functions;

import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class OrgSuite
{
	public static void main(String[] args)
	{
		//Login
		OrgMAster om=new OrgMAster();
		
		String res=om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		Sleeper.sleepTightInSeconds(5);
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		//Emp reg
		
		res=om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		Sleeper.sleepTightInSeconds(5);
		
		res=om.org_Empreg("Indira", "Indira");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//Userreg
		
		res=om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		Sleeper.sleepTightInSeconds(5);
		
		res=om.org_Userreg("Indira Indira", "Indira123456", "Indira123456", "Indira123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

		//user login
		
		res=om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
		
		res=om.org_Login("Indira123456", "Indira123456");
		System.out.println(res);
		Sleeper.sleepTightInSeconds(5);
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
	}

}
