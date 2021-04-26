package positiveTests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;

public class EWASuccess extends BaseClass{
	@Test (priority = 1)
	public void EWA() {
	
	MobileElement ewa1 = (MobileElement)driver.findElementByAccessibilityId("welcomeLogIn"); 
	ewa1.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa2 = (MobileElement)driver.findElementByAccessibilityId("loginInputEmail"); 
	ewa2.sendKeys("lubna+92@getclair.com");;
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa3 = (MobileElement)driver.findElementByAccessibilityId("loginInputPassword"); 
	ewa3.sendKeys("Anay@2020!");
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa4 = (MobileElement)driver.findElementByAccessibilityId("loginPasswordEye"); 
	ewa4.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa5 = (MobileElement)driver.findElementByAccessibilityId("loginContinue"); 
	ewa5.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa6 = (MobileElement)driver.findElementByAccessibilityId("securityPreferencesDone"); 
	ewa6.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa7 = (MobileElement)driver.findElementByAccessibilityId("balancesEarnedWages"); 
	ewa7.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa8 = (MobileElement)driver.findElementByAccessibilityId("transferInput"); 
	ewa8.sendKeys("0.02");
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa9 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/"
			+ "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
			+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
			+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
			+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/"
			+ "android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
			+ "android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
			+ "/android.view.ViewGroup[3]"); 
	ewa9.click();
	
	MobileElement ewa10 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
			+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
			+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
			+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[1]"); 
	ewa10.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa11 = (MobileElement)driver.findElementByAccessibilityId("alertActionYes"); 
	ewa11.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa12 = (MobileElement)driver.findElementByAccessibilityId("alertScreenSecondaryButton"); 
	ewa12.click();
	
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa14 = (MobileElement)driver.findElementByAccessibilityId("transferInput"); 
	ewa14.sendKeys("0.02");
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa15 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/"
			+ "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
			+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
			+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
			+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/"
			+ "android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
			+ "android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
			+ "/android.view.ViewGroup[3]"); 
	ewa15.click();
	
	MobileElement ewa16 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
			+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
			+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
			+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[1]"); 
	ewa16.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa13 = (MobileElement)driver.findElementByAccessibilityId("alertActionYes"); 
	ewa13.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	MobileElement ewa17 = (MobileElement)driver.findElementByAccessibilityId("alertScreenPrimaryButton"); 
	ewa17.click();
	
	driver.resetApp();
	
	
	

}
}
