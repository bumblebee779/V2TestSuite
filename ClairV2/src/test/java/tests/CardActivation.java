package tests;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;




import io.appium.java_client.MobileElement;

public class CardActivation extends BaseClass {

	//handles the activate now button on the card activation screen
	@Test (priority =1)
	public void ActivateCardScreen() {		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MobileElement e63 = (MobileElement)driver.findElementByAccessibilityId("bannerCardActivation"); 
		e63.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement activateButton = (MobileElement)driver.findElementByAccessibilityId("cardArrivalActivate"); 
		activateButton.click();
		
		
	}
	//handles the password entry items for card activation
	@Test (priority = 2)
	public void ActivationPwEntry() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e64 = (MobileElement)driver.findElementByAccessibilityId("backButton"); 
		e64.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement fin = (MobileElement)driver.findElementByAccessibilityId("securityFinishLater"); 
		fin.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e65 = (MobileElement)driver.findElementByAccessibilityId("cardArrivalActivate"); 
		e65.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e66 = (MobileElement)driver.findElementByAccessibilityId("cardActivationSecurityPasswordInput"); 
		e66.sendKeys("Anay@2020!");
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e67 = (MobileElement)driver.findElementByAccessibilityId("cardActivationSecurityEye"); 
		e67.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e68 = (MobileElement)driver.findElementByAccessibilityId("cardActivationSecurityConfirm"); 
		e68.click();
		
	}
	//pin setting input on the card activation flow
	@Test(priority = 3)
	public void ActivationPINSetting() {
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		MobileElement e71 = (MobileElement)driver.findElementByXPath("//hierarchy/"
				+ "android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/"
				+ "android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]"
				+ "/android.view.View[1]/android.widget.EditText[1]"); 
		e71.sendKeys("1234");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e72 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]"
				+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]"
				+ "/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]"); 
		e72.sendKeys("1234");
		
		MobileElement devButton = (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]");
		devButton.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e73 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]"
				+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]"
				+ "/android.view.View[1]/android.widget.Button[1]"); 
		e73.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.resetApp();
	}
	//all other screens in the card activation process
	public void CardActOtherScreens() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e74 = (MobileElement)driver.findElementByAccessibilityId("alertScreenPrimaryButton"); 
		e74.click();
		
	}
	
	
}
