package positiveTests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;

public class ActionRequiredConfirmCard extends BaseClass{
	@Test(priority = 1)
	public void accessConfirmNow() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Confirm1 = (MobileElement)driver.findElementByAccessibilityId("welcomeLogIn"); 
		Confirm1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Confirm2 = (MobileElement)driver.findElementByAccessibilityId("loginInputEmail"); 
		Confirm2.sendKeys("lubna+91@getclair.com");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Confirm3 = (MobileElement)driver.findElementByAccessibilityId("loginInputPassword"); 
		Confirm3.sendKeys("Anay@2020!");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Confirm4 = (MobileElement)driver.findElementByAccessibilityId("loginPasswordEye"); 
		Confirm4.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Confirm5 = (MobileElement)driver.findElementByAccessibilityId("loginContinue"); 
		Confirm5.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Confirm7 = (MobileElement)driver.findElementByAccessibilityId("securityPreferencesDone"); 
		Confirm7.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement Confirm8 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"); 
		Confirm8.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement Confirm9 = (MobileElement)driver.findElementByAccessibilityId("actionItem0"); 
		Confirm9.click();
		
		MobileElement confirmCard2 = (MobileElement)driver.findElementByAccessibilityId("cardArrivalLetUsKnow"); 
		confirmCard2.click();
		
		MobileElement confirmCard3 = (MobileElement)driver.findElementByAccessibilityId("verifyAddressConfirm"); 
		confirmCard3.click();
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.resetApp();
	}

}
