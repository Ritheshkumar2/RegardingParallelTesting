package example;
import org.testng.annotations.Test;

public class TestRunn {
	
	@Test
	public void test() {
		Example obj=new Example();
		obj.testOnChromeWithBrowserStackUrl();
		obj.testOnChromeWithBrowserStackSignUp();
	}

}
