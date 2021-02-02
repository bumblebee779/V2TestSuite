package positiveTests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import helperFunctions.Scrolling;
import io.appium.java_client.MobileElement;

public class MoveMoneyBankTransfer extends BaseClass{
	@Test (priority = 1)
	public void BankTransfer() {
		
		LogIn login3 = new LogIn();
		login3.Login();
		
		MobileElement bankTrans0 = (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]");
		bankTrans0.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		MobileElement bankTrans1 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[2]/android.widget.TextView[1]");
		bankTrans1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		}
		@Test (priority = 2)
		public void scrollNow4() {
		Scrolling scrolling = new Scrolling();
		scrolling.scrollDownReview();
		
	}
		@Test (priority = 3)
		public void clickBankTransferPrevRecptPerform() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement bankTrans2 = (MobileElement)driver.findElementByAccessibilityId("moveMoneyTransferToOtherBanks");
		bankTrans2.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement bankTrans3 = (MobileElement)driver.findElementByAccessibilityId("transferRecipient0");
		bankTrans3.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement bankTrans4 = (MobileElement)driver.findElementByAccessibilityId("transferInput");
		bankTrans4.sendKeys("34");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement bankTrans5 = (MobileElement)driver.findElementByAccessibilityId("newTransferNote");
		bankTrans5.sendKeys("Happy Bank Transfer");
	
	}
		@Test (priority = 4)
		public void scrollNow5() {
			Scrolling scrolling = new Scrolling();
			scrolling.scrollDown();
			
		}
		@Test (priority = 5)
		public void PerformTransfer() {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
			
			MobileElement bankTrans6 = (MobileElement)driver.findElementByAccessibilityId("newTransferPerform");
			bankTrans6.click();
		}
		@Test (priority = 6)
		public void clickYestoPerfBankTrans() {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
			
			MobileElement bankTrans7 = (MobileElement)driver.findElementByAccessibilityId("alertActionYes");
			bankTrans7.click();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
			
			driver.resetApp();
			
		}
			public void addNewTrans() {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
			
			MobileElement bankTrans7 = (MobileElement)driver.findElementByAccessibilityId("alertActionYes");
			bankTrans7.click();
			
			}

}

