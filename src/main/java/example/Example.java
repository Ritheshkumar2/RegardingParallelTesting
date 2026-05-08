package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Example {
	
	WebDriver driver;

	@Test()
	public void testOnChromeWithBrowserStackUrl()
	{
	driver=new EdgeDriver();
	driver.get("https://www.browserstack.com/");
	driver.manage().window().maximize();
	System.out.println("this is the test related to edge1 browserstack login");
	System.out.println("this is the test related to edge1 browserstack login"+ " " +Thread.currentThread().getId());
	driver.close();
	}

	
	@Test()
	public void testOnChromeWithBrowserStackSignUp()
	{
	driver=new EdgeDriver();
	driver.get("https://www.browserstack.com/users/sign_up");
	System.out.println("this is the test related to edge2 browserstack login"+ " " +Thread.currentThread().getId());
	driver.close();

	}
}
