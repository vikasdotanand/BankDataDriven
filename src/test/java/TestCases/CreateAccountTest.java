package TestCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Utilities.DataUtil;

public class CreateAccountTest extends TestBase {

	@Test(dataProviderClass=DataUtil.class,dataProvider="dp")
	public void createAccount(String customer, String currency) {
		click("openAcc_css");
		select("custName_css",customer);
		select("currency_css", currency);
		click("processbtn_css");
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("Account created successfully"), "Customer Not Added Successfully");
		alert.accept();

	}

}
