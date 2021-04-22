package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.Screenshot;
import Utilities.Screenshot;
public class CustomListners implements ITestListener {


	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	
		Utilities.Screenshot.getScreenshot();
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href ="+Utilities.Screenshot.fname+" target=\"_blank\">Test Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a href ="+Utilities.Screenshot.fname+" target=\"_blank\"><img src="+Utilities.Screenshot.fname+" width=\"300\" height=\"300\"></img></a>");	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println(result.getMethod().getMethodName());
		//Reporter.log("<a href ="" target=\"_blank\"><img src=\"F:Goa 2020\\North Goa 31st Dec 2020\\20201231_131932.jpg\" width=\"300\" height=\"300\"></img></a>");
		/*Utilities.Screenshot.getScreenshot();
		System.out.println("File Name Inside Listeners = "+Utilities.Screenshot.fname);

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		//Reporter.log("<a href ="+Utilities.Screenshot.fname+" target=\"_blank\"><img src="+Utilities.Screenshot.fname +"height=\"300\" width=\"300\"></img></a>");
		Reporter.log("<a href ="+Utilities.Screenshot.fname+" target=\"_blank\">Test Screenshot</a>");
		Reporter.log("<br></br>");
		Reporter.log("<a href ="+Utilities.Screenshot.fname+" target=\"_blank\"><img src="+Utilities.Screenshot.fname+" width=\"300\" height=\"300\"></img></a>");	*/
	
		//Reporter.log("<a href =\"F:Goa 2020\\North Goa 31st Dec 2020\\20201231_131932.jpg\" target=\"_blank\"><img src=\"F:Goa 2020\\North Goa 31st Dec 2020\\20201231_131932.jpg\" width=\"300\" height=\"300\"></img></a>");	

		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
