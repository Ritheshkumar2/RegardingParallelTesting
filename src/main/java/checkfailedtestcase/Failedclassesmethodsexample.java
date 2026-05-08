package checkfailedtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failedclassesmethodsexample {
	
	@Test
	public void testwhatsapp() {
	Assert.assertTrue(true);
	System.out.println("Whatsapp is working fine");
	}
	
	    @Test
		public void testlinkedin() {
	    Assert.assertTrue(true);
		System.out.println("Linkedin is working fine");
		}
		@Test
		public void testgoogle() {
		Assert.assertTrue(false);
		System.out.println("Google is working fine");
		}
		

}
