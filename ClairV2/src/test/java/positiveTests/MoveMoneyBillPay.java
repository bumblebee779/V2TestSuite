package positiveTests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import helperFunctions.Scrolling;
import io.appium.java_client.MobileElement;

public class MoveMoneyBillPay extends BaseClass{
	@Test (priority = 1)
	public void MailCheck() {
		LogIn login7 = new LogIn();
		login7.Login();
		
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
		
	
		
		Scrolling scrolling = new Scrolling();
		scrolling.scrollDownReview();
		
	}
			
		
		@Test (priority = 2)
		public void mailCheck() {
			MobileElement clickCheckMail = (MobileElement)driver.findElementByAccessibilityId("moveMoneyMailACheck");
			clickCheckMail.click();
			
			MobileElement clickCheckMail2 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
					+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
					+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
					+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
					+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
					+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
					+ "/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]");
			clickCheckMail2.click();
			
			MobileElement clickCheckMail3 = (MobileElement)driver.findElementByAccessibilityId("checkMailingAmount");
			clickCheckMail3.sendKeys("6");
			
			MobileElement clickCheckMail4 = (MobileElement)driver.findElementByAccessibilityId("checkMailingName");
			clickCheckMail4.sendKeys("Anderson Cooper");
			
			MobileElement clickCheckMail5 = (MobileElement)driver.findElementByAccessibilityId("checkMailingUseMyAddress");
			clickCheckMail5.click();
			
			Scrolling scrolling = new Scrolling();
			scrolling.scrollDown();
			
			MobileElement clickCheckMail6 = (MobileElement)driver.findElementByAccessibilityId("checkMailingViewCheck");
			clickCheckMail6.click();
			
			MobileElement clickCheckMail7 = (MobileElement)driver.findElementByAccessibilityId("checkMailingNote");
			clickCheckMail7.sendKeys("$$$ 4 U");
			
			MobileElement clickCheckMail8 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
					+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
					+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
					+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
					+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]"
					+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
					+ "/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]");
			clickCheckMail8.click();
			
			MobileElement clickCheckMail9 = (MobileElement)driver.findElementByAccessibilityId("checkMailingConfirmAndSend");
			clickCheckMail9.click();
			
			driver.resetApp();
		}
		
			
			
		
	}


