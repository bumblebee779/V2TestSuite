package positiveTests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import helperFunctions.Scrolling;
import io.appium.java_client.MobileElement;

public class MoveMoneyDeleteTransfer extends BaseClass{
	
	@Test (priority = 1)
	public void accessdeleteTrans() {
		MoveMoneyBankTransfer deleteTrans = new MoveMoneyBankTransfer();
		deleteTrans.BankTransfer();
		deleteTrans.scrollNow4();
	}
	
	@Test (priority = 2)
	public void gonnaDelete() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement transferDel1 = (MobileElement)driver.findElementByAccessibilityId("moveMoneyTransferToOtherBanks");
		transferDel1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement transferDel2 = (MobileElement)driver.findElementByAccessibilityId("transferRecipient0");
		transferDel2.click();
		
		Scrolling scrollTransDelete = new Scrolling();
		scrollTransDelete.scrollDownReview();
		
		MobileElement transferDel3 = (MobileElement)driver.findElementByAccessibilityId("newTransferDeleteRecipient");
		transferDel3.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement transferDel4 = (MobileElement)driver.findElementByAccessibilityId("alertActionYes");
		transferDel4.click();
		
		driver.resetApp();
		
	}

}
