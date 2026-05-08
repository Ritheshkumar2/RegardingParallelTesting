package checkfailedtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retryingpurpose {
	
	
	@Test(retryAnalyzer=Retry.class)
	public void testgoogle1() {
	Assert.assertTrue(false);
	System.out.println("Google is working fine");
	}

}
