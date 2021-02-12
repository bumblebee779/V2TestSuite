package positiveTests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import helperFunctions.Scrolling;
import io.appium.java_client.MobileElement;

public class ReplaceLostCard extends BaseClass{
	@Test (priority = 1)
	public void replaceLostCard() {
	FreezeCard replaceLost = new FreezeCard();
	replaceLost.freezeCard();
}	@Test (priority = 2)
	public void replaceTheLost() {
		Scrolling replaceLostScroll = new Scrolling();
		replaceLostScroll.scrollDown();
		replaceLostScroll.scrollDown();
	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement replaceLost1 = (MobileElement)driver.findElementByAccessibilityId("cardDetailsReplaceMyCard"); 
		replaceLost1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement replaceLost2 = (MobileElement)driver.findElementByAccessibilityId("replaceCardLost"); 
		replaceLost2.click();
		
		Scrolling replaceLostScroll1 = new Scrolling();
		replaceLostScroll1.scrollDown();
		replaceLostScroll1.scrollDown();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement replaceLost3 = (MobileElement)driver.findElementByAccessibilityId("replaceCardSubmit"); 
		replaceLost3.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement replaceLost4 = (MobileElement)driver.findElementByAccessibilityId("alertActionYes"); 
		replaceLost4.click();
		
		driver.resetApp();
		
	}


	
}
