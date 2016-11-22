package functions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicFunctions 
{
	public static String url="http://google.com";

	public static WebDriver driver;
	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicFunctions fun=new BasicFunctions();
		
		fun.function3();
		
		boolean flag=fun.function4();
		System.out.println(flag);
	}
	
	//static Function without returning any value
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	//static function with returning value
	
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}

	//Non Static Function without returning value
	
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	
	//Non static function with returning value
	
	public boolean function4()
	{
		System.out.println("This is function4");
		return true;
	}
	
	public void Launch(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void Takes_Screenshot(WebDriver driver,String name) throws IOException
	{

		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Morning830Batch\\SeleniumProject\\src\\screenshots\\"+name+".png"));
		
	}
}
