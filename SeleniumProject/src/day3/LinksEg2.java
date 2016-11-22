package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 
{
	public static void main(String[] args)
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String linkText=links.get(i).getText();
			
			if (linkText.equalsIgnoreCase("Gmail"))
			{
				links.get(i).click();
				flag=true;
				break;
			}
			
		}
		if (flag==true)
		{
			System.out.println("The expected link available in the page");
			
		}
		else
		{
			System.out.println("The Expected link not available in the page");
		}
		
		

	}


}
