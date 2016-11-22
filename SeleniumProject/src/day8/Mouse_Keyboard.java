package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Keyboard {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions act=new Actions(driver);
		//Focusing on gmail
		act.moveToElement(gmail).build().perform();
		Sleeper.sleepTightInSeconds(5);
		//Rightclick 
		act.contextClick().build().perform();
		//Keyboard
		Sleeper.sleepTightInSeconds(5);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Sleeper.sleepTightInSeconds(5);
		
		act.sendKeys(Keys.ENTER).build().perform();
//		act.sendKeys(Keys.F5).build().perform();

	}
}
