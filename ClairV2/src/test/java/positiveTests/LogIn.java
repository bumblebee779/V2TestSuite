package positiveTests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;



import io.appium.java_client.MobileElement;

public class LogIn extends BaseClass{
	//login screen and functionality
	@Test(priority = 1)
	public void Login() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e55 = (MobileElement)driver.findElementByAccessibilityId("welcomeLogIn"); 
		e55.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e56 = (MobileElement)driver.findElementByAccessibilityId("loginInputEmail"); 
		e56.sendKeys("lubna+56@getclair.com");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e57 = (MobileElement)driver.findElementByAccessibilityId("loginInputPassword"); 
		e57.sendKeys("Anay@2020!");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e58 = (MobileElement)driver.findElementByAccessibilityId("loginPasswordEye"); 
		e58.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e59 = (MobileElement)driver.findElementByAccessibilityId("loginContinue"); 
		e59.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e61 = (MobileElement)driver.findElementByAccessibilityId("securityPreferencesDone"); 
		e61.click();
		
		}

}
