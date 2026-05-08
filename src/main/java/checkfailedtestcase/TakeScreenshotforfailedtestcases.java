package checkfailedtestcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TakeScreenshotforfailedtestcases implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        getscreenshotforfailedtestcase(result);
    }

    public void getscreenshotforfailedtestcase(ITestResult result) {

        WebDriver driver=BaseClass.getDriver(); // ✅ get driver from base class

        if (result.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            try {
                File dest = new File("test-output/" + result.getName() + ".png");
                FileUtils.copyFile(src, dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}