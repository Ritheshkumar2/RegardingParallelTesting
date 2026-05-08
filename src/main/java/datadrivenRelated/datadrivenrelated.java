package datadrivenRelated;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadrivenrelated {
	
	
	@Test(dataProvider = "getData")
	public void test(String username,String password) {
		System.out.println(username +"--"+password);
	}
	
	@DataProvider(name = "getData")
	public Object[][] getData() {
		return new Object[][] {{"user","password"},{"user","password"}};
	    // Read Excel and return Object[][]
	}
}
