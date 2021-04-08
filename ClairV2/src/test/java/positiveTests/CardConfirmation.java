package positiveTests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import helperFunctions.Scrolling;

public class CardConfirmation extends BaseClass {
	@Test(priority = 1)
	public void ConfirmCardLogin() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin1 = (MobileElement)driver.findElementByAccessibilityId("welcomeLogIn"); 
		confirmLogin1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin2 = (MobileElement)driver.findElementByAccessibilityId("loginInputEmail"); 
		confirmLogin2.sendKeys("lubna+92@getclair.com");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin3 = (MobileElement)driver.findElementByAccessibilityId("loginInputPassword"); 
		confirmLogin3.sendKeys("Anay@2020!");
		
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
	public void AccessBanner() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmCard0 = (MobileElement)driver.findElementByAccessibilityId("bannerAccountSetup"); 
		confirmCard0.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement closeDevButton = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]"); 
		closeDevButton.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test(priority = 3)
	public void scrollNow() {
			Scrolling scrolling = new Scrolling();
			scrolling.scrollDown();

		}
	@Test(priority = 4)
	public void ConfirmThatCard() {
		MobileElement alreadyButton = (MobileElement)driver.findElementByAccessibilityId("touchableAlreadyLinkedDirectDeposit"); 
		alreadyButton.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement item1 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"); 
		item1.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement troubleShootBack = (MobileElement)driver.findElementByAccessibilityId("backButton"); 
		troubleShootBack.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement onceMoreBack = (MobileElement)driver.findElementByAccessibilityId("backButton"); 
		onceMoreBack.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmCard1 = (MobileElement)driver.findElementByAccessibilityId("listItemConfirmCard"); 
		confirmCard1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		MobileElement confirmCard2 = (MobileElement)driver.findElementByAccessibilityId("cardArrivalLetUsKnow"); 
		confirmCard2.click();
		
		MobileElement confirmCard3 = (MobileElement)driver.findElementByAccessibilityId("verifyAddressConfirm"); 
		confirmCard3.click();
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.resetApp();
		
		
//		MobileElement confirmCard3 = (MobileElement)driver.findElementByAccessibilityId("modalCloseIcon"); 
//		confirmCard3.click();
//		
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
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
