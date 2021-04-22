package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;

public class BankManagerLogin extends TestBase {
	
	@Test(groups="bml")
	public void bMgrLogin()
	{
		click("BMgrLogbtn_css");
		System.out.println("Is Element Add Cutomer Found = "+isElementFound("addCustbtn_css"));
		Assert.assertTrue(isElementFound("addCustbtn_css"), "Bank Manager Not able to Login Successfully");
	}

}
