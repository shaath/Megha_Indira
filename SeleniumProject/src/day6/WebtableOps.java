package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class WebtableOps {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

//		String empName=driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[3]/td[3]/a")).getText();
//		System.out.println(empName);
		
		Sleeper.sleepTightInSeconds(5);
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++) 
		{
//			System.out.println(rows.get(i).getText());
			
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String f=cols.get(2).getText();
			System.out.println(f);
			if (f.equalsIgnoreCase("Thomas")) 
			{
				System.out.println("Pass");
				break;
			}
			
		}
	}

}
