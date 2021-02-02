package positiveTests;

import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass{
	
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
		cap.setCapability(MobileCapabilityType.APP, "/Users/lubna/Downloads/clair-b7ae00cf665245f9ba38f72d2226311a-signed.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
	
}