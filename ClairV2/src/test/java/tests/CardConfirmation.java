package tests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;

public class CardConfirmation extends BaseClass {
	@Test(priority = 1)
	public void ConfirmCardLogin() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin1 = (MobileElement)driver.findElementByAccessibilityId("welcomeLogIn"); 
		confirmLogin1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin2 = (MobileElement)driver.findElementByAccessibilityId("loginInputEmail"); 
		confirmLogin2.sendKeys("charliechaplin@choco.la");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin3 = (MobileElement)driver.findElementByAccessibilityId("loginInputPassword"); 
		confirmLogin3.sendKeys("CharlieChaplin123!");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin4 = (MobileElement)driver.findElementByAccessibilityId("loginPasswordEye"); 
		confirmLogin4.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin5 = (MobileElement)driver.findElementByAccessibilityId("loginContinue"); 
		confirmLogin5.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin7 = (MobileElement)driver.findElementByAccessibilityId("securityPreferencesDone"); 
		confirmLogin7.click();
		
	}
	@Test(priority = 2)
	public void ConfirmThatCard() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmCard0 = (MobileElement)driver.findElementByAccessibilityId("bannerCardConfirmation"); 
		confirmCard0.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmCard1 = (MobileElement)driver.findElementByAccessibilityId("cardArrivalLetUsKnow"); 
		confirmCard1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmCard2 = (MobileElement)driver.findElementByAccessibilityId("verifyAddressConfirm"); 
		confirmCard2.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmCard3 = (MobileElement)driver.findElementByAccessibilityId("modalCloseIcon"); 
		confirmCard3.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		
//		MobileElement confirmCard3 = (MobileElement)driver.findElementByAccessibilityId("cardArrivalActivate"); 
//		confirmCard3.click();
//		
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		
//		MobileElement confirmCard4 = (MobileElement)driver.findElementByAccessibilityId("alertScreenPrimaryButton"); 
//		confirmCard4.click();
		
		
		
		
	}

}
