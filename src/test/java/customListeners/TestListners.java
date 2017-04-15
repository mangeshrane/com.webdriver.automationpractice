package customListeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import testBase.TestBase;


public class TestListners extends TestBase  implements ITestListener{

	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
			String imageFileName = "Failed"+result.getName()+".png";
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(src,new File("F:\\EclipseProject\\com.webdriver.automationpractice\\src\\test\\java\\screenshots\\"+imageFileName));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			Reporter.log(result.getMethod()+"is Failed");
			//Reporter.log("To view screenshot on this link:" + "<a href=\" "+imageFileName+" \"> screenshot <img src= \" file:\\imageFileName" \" />");
			
			
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


}

