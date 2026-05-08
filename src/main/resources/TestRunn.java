import example.Example;

public class TestRunn {
	
	@Test
	public void test() {
		Example obj=new Example();
		obj.testOnChromeWithBrowserStackUrl();
		obj.testOnChromeWithBrowserStackSignUp();
	}

}
