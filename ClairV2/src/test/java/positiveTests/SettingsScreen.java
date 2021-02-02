package positiveTests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import helperFunctions.Scrolling;

import io.appium.java_client.MobileElement;

public class SettingsScreen extends BaseClass{
	@Test (priority = 1)
	public void accessSettings() {
		LogIn loginset = new LogIn();
		loginset.Login();
		
		MobileElement clickSettings1 = (MobileElement)driver.findElementByAccessibilityId("homeSettingsGear"); 
		clickSettings1.click();
		
		Scrolling settingsScroll = new Scrolling();
		settingsScroll.scrollDown();
		settingsScroll.scrollDown();
		
		MobileElement settings4 = (MobileElement)driver.findElementByAccessibilityId("eyeIconLeft"); 
		settings4.click();
		
		MobileElement clickSettings2 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[2]/android.view.ViewGroup[5]"); 
		clickSettings2.click();
		
		MobileElement settings5 = (MobileElement)driver.findElementByAccessibilityId("backButton"); 
		settings5.click();
		
//		MoveMoneyDD settingsDD = new MoveMoneyDD();
//		settingsDD.scrollNow3();
//		
		settingsScroll.scrollDown();
		settingsScroll.scrollDown();
		
		MobileElement settings6 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/"
				+ "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]");
		settings6.click();
		
		MobileElement settings7 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
		settings7.click();
		
		MobileElement settings8 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]"
				+ "/android.widget.TextView[1]");
		settings8.click();
		
		driver.resetApp();
	
	}
}
