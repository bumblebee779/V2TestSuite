package positiveTests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import helperFunctions.Scrolling;
import io.appium.java_client.MobileElement;


public class MoveMoneyAddTransfer extends BaseClass {
	
	@Test (priority = 1)
	public void addRecipientBasic1() {
		MoveMoneyBankTransfer addTrans = new MoveMoneyBankTransfer();
		addTrans.BankTransfer();
		addTrans.scrollNow4();
	}
	
	@Test (priority = 2)
	public void addRecipientBasic2() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addbankTrans1 = (MobileElement)driver.findElementByAccessibilityId("moveMoneyTransferToOtherBanks");
		addbankTrans1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addbankTrans2 = (MobileElement)driver.findElementByAccessibilityId("addNewBankTransfer");
		addbankTrans2.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addbankTrans3 = (MobileElement)driver.findElementByAccessibilityId("transferInput");
		addbankTrans3.sendKeys("3");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addbankTrans4 = (MobileElement)driver.findElementByAccessibilityId("newTransferTo");
		addbankTrans4.sendKeys("Jhonny Cash");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addbankTrans5 = (MobileElement)driver.findElementByAccessibilityId("newTransferAccountNumber");
		addbankTrans5.sendKeys("12345678910");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addbankTrans6 = (MobileElement)driver.findElementByAccessibilityId("newTransferRoutingNumber");
		addbankTrans6.sendKeys("022300173");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addbankTrans7 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[5]"
				+ "/android.widget.Spinner[1]/android.widget.TextView[1]");
		addbankTrans7.click();
		
		MobileElement addbankTrans8 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/androidx.appcompat.widget.LinearLayoutCompat[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.CheckedTextView[2]");
		addbankTrans8.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addbankTrans9 = (MobileElement)driver.findElementByAccessibilityId("newTransferNote");
		addbankTrans9.sendKeys("Holiday party $$$");
		
		Scrolling scrollTrans = new Scrolling();
		scrollTrans.scrollDown();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addbankTrans10 = (MobileElement)driver.findElementByAccessibilityId("newTransferPerform");
		addbankTrans10.click();
		
		MoveMoneyBankTransfer addIt = new MoveMoneyBankTransfer();
		addIt.addNewTrans();
		
		driver.resetApp();
		
		}
	
	

}
