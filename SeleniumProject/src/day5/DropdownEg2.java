package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args)
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		
		WebElement fDrop=driver.findElement(By.id("fromCity"));
		
		WebElement tDrop=driver.findElement(By.id("toCity"));
		
		Select f=new Select(fDrop);
		
		Select t=new Select(tDrop);
		
		List<WebElement> fList=f.getOptions();
		
		System.out.println(fList.size());
		
		for (int i = 0; i < fList.size(); i++)
		{
			f.selectByIndex(i);
			
			String fCity=fList.get(i).getText();
			System.out.println(fCity);
			
			List<WebElement> tList=t.getOptions();
			for (int j = 0; j < tList.size(); j++)
			{
				t.selectByIndex(j);
				String tCity=tList.get(i).getText();
				if (fCity.equalsIgnoreCase(tCity))
				{
					System.out.println("Fail");
					break;
				}
			}
		}
		
	}

}
