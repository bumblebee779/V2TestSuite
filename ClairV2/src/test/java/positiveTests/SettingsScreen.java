package positiveTests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import helperFunctions.Scrolling;

import io.appium.java_client.MobileElement;

public class SettingsScreen extends BaseClass{
	@Test (priority = 1)
	public void accessSettings() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		LogIn loginset = new LogIn();
		loginset.Login();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement clickSettings1 = (MobileElement)driver.findElementByAccessibilityId("homeSettingsGear"); 
		clickSettings1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Scrolling settingsScroll = new Scrolling();
		settingsScroll.scrollDown();
		settingsScroll.scrollDown();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement settings4 = (MobileElement)driver.findElementByAccessibilityId("eyeIconLeft"); 
		settings4.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement settings2 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.widget.TextView[1]");
		settings2.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement settings5 = (MobileElement)driver.findElementByAccessibilityId("backButton"); 
		settings5.click();
	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		settingsScroll.scrollDown();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		settingsScroll.scrollDown();
		
		MobileElement settings6 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[1]");
		settings6.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
		MobileElement settings7 = (MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout[1]/"
				+ "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]");
		settings7.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement settings8 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/"
				+ "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.TextView[1]");
		settings8.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.resetApp();
	
	}
}
