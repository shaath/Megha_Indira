package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
		driver.findElement(By.id("next")).click();
		
		Thread.sleep(5000);
		
		if (driver.findElement(By.id("PersistentCookie")).isSelected())
		{
			driver.findElement(By.id("PersistentCookie")).click();
		}
		else
		{
			System.out.println("It is alredy in unchecked position");
		}
		
	}

}
