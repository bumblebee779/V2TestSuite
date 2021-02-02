package positiveTests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import helperFunctions.Scrolling;
import io.appium.java_client.MobileElement;

public class MoveMoneyDD extends BaseClass {
	@Test (priority = 1)
	public void SetUpDirectDeposit() {
		LogIn login6 = new LogIn();
		login6.Login();
		
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
		
		MobileElement SetupDD2 = (MobileElement)driver.findElementByAccessibilityId("eyeIconLeft"); 
		SetupDD2.click();
		
	}
	@Test (priority = 2)
	public void scrollNow3() {
		Scrolling scrolling = new Scrolling();
		scrolling.scrollDown();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement SetupDD3 = (MobileElement)driver.findElementByAccessibilityId("getDirectDepositForm"); 
		SetupDD3.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement SetupDD4 = (MobileElement)driver.findElementByAccessibilityId("alertScreenPrimaryButton"); 
		SetupDD4.click();
		
	}
	
	@Test (priority = 3)
	public void finishSetupDD() {
		
		driver.resetApp();
		
	}

}
