package positiveTests;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import helperFunctions.Scrolling;

public class ActionRequiredReLinkDD extends BaseClass{
	@Test(priority = 1)
	public void reLinkDD() {
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

	MobileElement Confirm8 = (MobileElement)driver.findElementByAccessibilityId("bannerActionRequired"); 
	Confirm8.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	MobileElement Confirm9 = (MobileElement)driver.findElementByAccessibilityId("actionItem1");
	Confirm9.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	MobileElement Confirm10 = (MobileElement)driver.findElementByAccessibilityId("touchableTryDirectDepositAgain"); 
	Confirm10.click();
	
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
		
		MobileElement bankTrans9 = (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]");
		bankTrans9.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

		MobileElement atomicDD8 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[4]/android.widget.Button[1]");
		atomicDD8.click();
		
		driver.resetApp();
}
	
}
