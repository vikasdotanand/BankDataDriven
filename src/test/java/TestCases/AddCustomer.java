package TestCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Utilities.DataUtil;

public class AddCustomer extends TestBase{

	@Test(dataProviderClass=DataUtil.class,dataProvider="dp")
	public void addCustomer(String fName,String lName,String postCode)
	{
		System.out.println("First Name ="+fName+"Last Name = "+lName+"Poscode = "+postCode);
		click("addCustbtn_css");
		typeEle("fName_css", fName);
		typeEle("lName_css", lName);
		typeEle("postCode_css", postCode);
		click("addCustbtn1_css");
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("Customer added successfully"),"Customer Not Added Successfully");
		alert.accept();
		
		
	}
}
