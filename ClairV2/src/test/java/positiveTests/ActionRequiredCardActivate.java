package positiveTests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;

public class ActionRequiredCardActivate extends BaseClass{
	
	
	@Test(priority = 1)
	public void accessActivateNow() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Action1 = (MobileElement)driver.findElementByAccessibilityId("welcomeLogIn"); 
		Action1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Action2 = (MobileElement)driver.findElementByAccessibilityId("loginInputEmail"); 
		Action2.sendKeys("rahlubna+2@gmail.com");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Action3 = (MobileElement)driver.findElementByAccessibilityId("loginInputPassword"); 
		Action3.sendKeys("Anay@2020!");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Action4 = (MobileElement)driver.findElementByAccessibilityId("loginPasswordEye"); 
		Action4.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Action5 = (MobileElement)driver.findElementByAccessibilityId("loginContinue"); 
		Action5.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement Action7 = (MobileElement)driver.findElementByAccessibilityId("securityPreferencesDone"); 
		Action7.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement Action8 = (MobileElement)driver.findElementByAccessibilityId("bannerActionRequired"); 
		Action8.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement Action9 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]"); 
		Action9.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MobileElement activateNow = (MobileElement)driver.findElementByAccessibilityId("alertScreenPrimaryButton"); 
		activateNow.click();
		
		driver.resetApp();
		
	}
}
//		
//		
//		
//		MobileElement activateNow = (MobileElement)driver.findElementByAccessibilityId("alertScreenPrimaryButton"); 
//		activateNow.click();
//		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		MobileElement e71 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
//				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
//				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
//				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
//				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[2]"
//				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]"
//				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]"
//				+ "/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]"); 
//		e71.sendKeys("1234");
//		
//		MobileElement bankTrans9 = (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
//				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
//				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
//				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
//				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]");
//		bankTrans9.click();
//		
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		
//		MobileElement e72 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
//				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
//				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
//				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
//				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[2]"
//				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]"
//				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]"
//				+ "/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]"); 
//		e72.sendKeys("1234");
//		
//		
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		
//		MobileElement e73 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
//				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
//				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
//				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
//				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
//				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]"
//				+ "/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]"
//				+ "/android.view.View[1]/android.widget.Button[1]"); 
//		e73.click();
//		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		driver.resetApp();
//		
//	}
//
//}
