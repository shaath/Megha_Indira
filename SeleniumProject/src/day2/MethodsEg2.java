package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		//getTitle()---->To get the title of th page
		
//		System.out.println(driver.getTitle());
		
		//getCurrentUrl()--->to get the url of the page
		
//		System.out.println(driver.getCurrentUrl());
		
		//getPageSorce()
		
		System.out.println(driver.getPageSource());

	}

}
