package positiveTests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import dbManagement.DBConnect;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass extends DBConnect{
	
	public static AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setup() throws InterruptedException, MalformedURLException{
	
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Google Pixel");
		cap.setCapability("udid", "92FAY00ZVX");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		
		cap.setCapability("appPackage", "com.clair.clairpay");
		cap.setCapability("appActivity", "host.exp.exponent.MainActivity");
		cap.setCapability(MobileCapabilityType.APP, "/Users/lubna/Downloads/clair-ed7dc349143d425599c9e4f9c4204f0d-signed.apk");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
	
	@AfterSuite
	public void executeQuery() throws Exception {
		DBConnect Q1 = new DBConnect();
		Q1.getAnswerFromDB();
		
	
}
}
