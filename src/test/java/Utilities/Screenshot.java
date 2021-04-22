package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;


public  class Screenshot extends TestBase{

	public static String fname;
	public static void getScreenshot()
	{
		Date date = new Date();
		fname =  System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+ date.toString().replace(" ", "_").replace(":", "_")+".jpg";
		//System.out.println("File Name Inside Screenshot = "+fname);
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File (fname));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.info(e.getMessage());
		}
		
		
	}
	

}
