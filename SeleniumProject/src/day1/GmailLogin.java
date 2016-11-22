package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		//Implicit wait
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		//manage()
		//MAximizing the window
		driver.manage().window().maximize();
		
		//findElement()---->To Identify an element
		//Enter the email id into email text box
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
		
//		Sleeper.sleepTightInSeconds(5);
		//Deleting the text from email text box 
		
//		driver.findElement(By.id("Email")).clear();
		//Clicking on Next button  (Locator------>name)
		driver.findElement(By.name("signIn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signIn")));
		
//		Sleeper.sleepTightInSeconds(5);
		//Enter the password  (Locator---->xpath)
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("1231235");
		//Clicking on sign in button  (Locator----->cssSelector)
		driver.findElement(By.cssSelector("#signIn")).click();
						
	}

}
