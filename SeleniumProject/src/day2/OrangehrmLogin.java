package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class OrangehrmLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		//Clicking on the welcome admin link (Locator-----> partialLinkText)
		driver.findElement(By.partialLinkText("Welcome")).click();
		//Clicking on the Logout link (Locator---->linkText)
		driver.findElement(By.linkText("Logout")).click();
		
		//close()---->It close the current browser
		driver.close();
		

	}

}
