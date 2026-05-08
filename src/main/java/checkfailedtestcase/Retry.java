package checkfailedtestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	private int rcount=0;
	private static final int maxrcount=3;
	
	public boolean retry(ITestResult result) {
		if(rcount<maxrcount) {
			rcount++;
			return true;
		}
		return false;
	}

}
