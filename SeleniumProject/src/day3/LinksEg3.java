package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		//Method1
//		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();
		//Method 2
		
//		List<WebElement> links=driver.findElements(By.linkText("Home"));
//		System.out.println(links.size());
//		
//		for (int i = 0; i < links.size(); i++)
//		{
//			String href=links.get(i).getAttribute("href");
//			System.out.println(href);
//			if (href.equalsIgnoreCase("http://primusbank.qedgetech.com/home.aspx")) 
//			{
//				links.get(i).click();
//				break;
//			}
//		}
		
		//Method3
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String lText=links.get(i).getText();
			System.out.println(lText);
			if (lText.equalsIgnoreCase("Home"))
			{
				links.get(i).click();
				break;
			}	
			
		}
		
	}

}
