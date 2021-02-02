package positiveTests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;

public class MoveMoneyAddCash extends BaseClass{
	@Test (priority = 1)
	public void getToAddCash() {
		MoveMoneyBankTransfer addCash = new MoveMoneyBankTransfer();
		addCash.BankTransfer();
		addCash.scrollNow4();
	}
	@Test (priority = 2)
	public void clickAddCash() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addCash1 = (MobileElement)driver.findElementByAccessibilityId("moveMoneyAddCash");
		addCash1.click();
	}
	@Test(priority = 3)
	public void completeAddCash() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		
		MobileElement addCash2 = (MobileElement)driver.findElementByAccessibilityId("findTheNearestLocation");
		addCash2.click();
		
		driver.resetApp();
	}
	
	

}
