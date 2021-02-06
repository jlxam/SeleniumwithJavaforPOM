package Antony;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Antony.Util;
import io.qameta.allure.Attachment;
 
public class Allurelist implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		saveScreenshotOnFailure(Util.getDriver());
		saveLogs(result.getMethod().getConstructorOrMethod().getName());
		
	}
	
	
	@Attachment(value = "Web Page Screenshot", type = "image/png")
	public byte[] takeScreenshot(WebDriver driver) {
			// Take a screenshot as byte array and return
			return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		}
	
	
	
	
	
	 @Attachment(value="Screenshot",type="image/png")
	public byte[] saveScreenshotOnFailure(WebDriver driver){
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	} 
	@Attachment(value="{0}", type="text/plain")
	public static String saveLogs(String message){
	return message;
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
