package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTC 
{
	public static WebDriver driver;
	@BeforeClass
	public void launchBr()
	{
		driver=new FirefoxDriver();
		
	}
	@BeforeMethod
	public void launchApp()
	{
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}

}
