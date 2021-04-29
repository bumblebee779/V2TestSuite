package positiveTests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import helperFunctions.Scrolling;

public class CardConfirmation extends BaseClass {
	@Test(priority = 1)
	public void ConfirmCardLogin1() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin1 = (MobileElement)driver.findElementByAccessibilityId("welcomeLogIn"); 
		confirmLogin1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmLogin2 = (MobileElement)driver.findElementByAccessibilityId("loginInputEmail"); 
		confirmLogin2.sendKeys("charliechaplin@choco.la");
		
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
	public void AccessBanner() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmCard0 = (MobileElement)driver.findElementByAccessibilityId("bannerActionRequired"); 
		confirmCard0.click();
	}
	
	@Test(priority = 3)
	public void ConfirmThatCard1() {
		
		
		MobileElement confirmCard1 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView[1]");
		confirmCard1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		MobileElement confirmCard2 = (MobileElement)driver.findElementByAccessibilityId("cardArrivalLetUsKnow"); 
		confirmCard2.click();
		
		MobileElement confirmCard3 = (MobileElement)driver.findElementByAccessibilityId("verifyAddressConfirm"); 
		confirmCard3.click();
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmCard4 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]");
		confirmCard4.click();
		
		MobileElement confirmCard5 = (MobileElement)driver.findElementByAccessibilityId("cardArrivalActivate"); 
		confirmCard5.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement confirmCard6 = (MobileElement)driver.findElementByAccessibilityId("alertScreenPrimaryButton"); 
		confirmCard6.click();
		
		
		
		driver.resetApp();
		
	}
		@Test (priority = 4)
		public void ConfirmCardLogin2() {
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement confirmLogin11 = (MobileElement)driver.findElementByAccessibilityId("welcomeLogIn"); 
			confirmLogin11.click();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement confirmLogin12 = (MobileElement)driver.findElementByAccessibilityId("loginInputEmail"); 
			confirmLogin12.sendKeys("lubna+90@getclair.com");;
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement confirmLogin13 = (MobileElement)driver.findElementByAccessibilityId("loginInputPassword"); 
			confirmLogin13.sendKeys("Anay@2020!");
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement confirmLogin14 = (MobileElement)driver.findElementByAccessibilityId("loginPasswordEye"); 
			confirmLogin14.click();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement confirmLogin15 = (MobileElement)driver.findElementByAccessibilityId("loginContinue"); 
			confirmLogin15.click();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement confirmLogin17 = (MobileElement)driver.findElementByAccessibilityId("securityPreferencesDone"); 
			confirmLogin17.click();
			
		}
		@Test(priority = 5)
		public void clickConfirmPart() {
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement confirmCard10 = (MobileElement)driver.findElementByAccessibilityId("bannerAccountSetup"); 
			confirmCard10.click();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement closeDevButton = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]"); 
			closeDevButton.click();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			
		}
		
		@Test(priority = 6)
		public void scrollNowTwice() {
				Scrolling scrolling = new Scrolling();
				scrolling.scrollDown();

			}
		@Test(priority = 7)
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
			
			MobileElement troubleShootBack2 = (MobileElement)driver.findElementByAccessibilityId("backButton"); 
			troubleShootBack2.click();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement confirmCard11 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[1]");
			confirmCard11.click();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			
			MobileElement confirmCard12 = (MobileElement)driver.findElementByAccessibilityId("cardArrivalLetUsKnow"); 
			confirmCard12.click();
			
			MobileElement confirmCard13 = (MobileElement)driver.findElementByAccessibilityId("verifyAddressConfirm"); 
			confirmCard13.click();
			
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement confirmCard14 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]");
			confirmCard14.click();
			
			MobileElement confirmCard15 = (MobileElement)driver.findElementByAccessibilityId("cardArrivalActivate"); 
			confirmCard15.click();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			MobileElement confirmCard16 = (MobileElement)driver.findElementByAccessibilityId("alertScreenPrimaryButton"); 
			confirmCard16.click();
			
			driver.resetApp();
			
		}
		
//		

		
		
		
		
	}


