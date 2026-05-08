package checkfailedtestcase;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(RetryListener.class)
public class Retryingpurpose2 {
	
	@Test
	public void testgoogle2() {
	System.out.println("Google is working fine Google is working fine");
	Assert.assertTrue(false);
	}

}
