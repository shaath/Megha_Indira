package day8;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowHandling
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getWindowHandle());
		
		
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String windowid=it.next();
			System.out.println(windowid);
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle()+"-------"+driver.getCurrentUrl());
			
			try 
			{
				driver.findElement(By.xpath("html/body/div[2]/div[2]/section/div/article/nav/section[1]/div/div/div[3]/a")).click();
//				Sleeper.sleepTightInSeconds(5);
//				System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
				break;
			}
			catch (Exception e) 
			{
				System.out.println("The expected link not avialable in this page");
			}
			
			
		}
		
		
//		driver.findElement(By.linkText("Terms of Service")).click();

	}

}
