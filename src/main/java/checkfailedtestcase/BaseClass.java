package checkfailedtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public static void setUpDriver() {
		driver.set(new ChromeDriver());
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}

}
