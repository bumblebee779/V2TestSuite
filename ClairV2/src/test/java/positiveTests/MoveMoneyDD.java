package positiveTests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import helperFunctions.Scrolling;
import io.appium.java_client.MobileElement;

public class MoveMoneyDD extends BaseClass {
	@Test (priority = 1)
	public void SetUpDirectDeposit() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e55 = (MobileElement)driver.findElementByAccessibilityId("welcomeLogIn"); 
		e55.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e56 = (MobileElement)driver.findElementByAccessibilityId("loginInputEmail"); 
		e56.sendKeys("lubna+78@getclair.com");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e57 = (MobileElement)driver.findElementByAccessibilityId("loginInputPassword"); 
		e57.sendKeys("Anay@2020!");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e58 = (MobileElement)driver.findElementByAccessibilityId("loginPasswordEye"); 
		e58.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e59 = (MobileElement)driver.findElementByAccessibilityId("loginContinue"); 
		e59.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e61 = (MobileElement)driver.findElementByAccessibilityId("securityPreferencesDone"); 
		e61.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 

		MobileElement bankTrans9 = (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]");
		bankTrans9.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		MobileElement bankTrans10 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[2]/android.widget.TextView[1]");
		bankTrans10.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement SetupDD1 = (MobileElement)driver.findElementByAccessibilityId("moveMoneySetUpDirectDeposit"); 
		SetupDD1.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement SetupDD2 = (MobileElement)driver.findElementByAccessibilityId("touchableChangeDirectDepositNow"); 
		SetupDD2.click();
	}

	@Test(priority = 2)
	public void scrollNow() {
		Scrolling scrolling = new Scrolling();
		scrolling.scrollDownReview();

	}
	@Test(priority = 3)	
	public void getToAtomic() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement SetupDD3 = (MobileElement)driver.findElementByAccessibilityId("touchableLetsGo"); 
		SetupDD3.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement atomicDD1 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/"
				+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/"
				+ "android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/"
				+ "android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]"); 
		atomicDD1.sendKeys("test-good");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement atomicDD6 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]"
				+ "/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]"
				+ "/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]"
				+ "/android.view.View[1]/android.widget.EditText[1]");
		atomicDD6.sendKeys("w");

		MobileElement atomicDD7 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.Button[1]");
		atomicDD7.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

		MobileElement atomicDD8 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[4]/android.widget.Button[1]");
		atomicDD8.click();
		
		driver.resetApp();
		
	}
	
		
		
		}
		
		
		
		



	//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//		
	//		MobileElement SetupDD2 = (MobileElement)driver.findElementByAccessibilityId("eyeIconLeft"); 
	//		SetupDD2.click();
	//		
	//	}
	//	@Test (priority = 2)
	//	public void scrollNow3() {
	//		Scrolling scrolling = new Scrolling();
	//		scrolling.scrollDown();
	//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//		
	//		MobileElement SetupDD3 = (MobileElement)driver.findElementByAccessibilityId("getDirectDepositForm"); 
	//		SetupDD3.click();
	//		
	//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//		
	//		MobileElement SetupDD4 = (MobileElement)driver.findElementByAccessibilityId("alertScreenPrimaryButton"); 
	//		SetupDD4.click();
	//		
	//	}
	//	
	//	@Test (priority = 3)
	//	public void finishSetupDD() {
	//		
	//		driver.resetApp();
	//		



