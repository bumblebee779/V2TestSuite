package positiveTests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;



public class SavingsScreen extends BaseClass{
	@Test (priority=1)
	public void Login() {
		LogIn login = new LogIn();
		login.Login();
	}
	
	@Test(priority=2)
	public void MoneyToSavings() {
		
		//click the Savings account box on Home screen
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement toSavings1 = (MobileElement)driver.findElementByAccessibilityId("balancesSavings"); 
		toSavings1.click();
		
		//click the Add to Savings piggy bank icon
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement toSavings2 = (MobileElement)driver.findElementByAccessibilityId("savingsAddToSavings"); 
		toSavings2.click();
		
		//enter the money amount
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement toSavings3 = (MobileElement)driver.findElementByAccessibilityId("transferInput"); 
		toSavings3.sendKeys("1");
		
		//click the Confirm button
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement toSavings4 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/"
				+ "android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.widget.ScrollView[1]/"
				+ "android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]"); 
		toSavings4.click();
		
		//click on the Yes button
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement clickYes = (MobileElement)driver.findElementByAccessibilityId("alertActionYes"); 
		clickYes.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.resetApp();
		}
	
	@Test (priority = 3)
	public void SavingsReminder() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		LogIn login1 = new LogIn();
		login1.Login();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement toSavings5 = (MobileElement)driver.findElementByAccessibilityId("balancesSavings"); 
		toSavings5.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement clickBell = (MobileElement)driver.findElementByAccessibilityId("savingsReminders"); 
		clickBell.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement clickButton = (MobileElement)driver.findElementByAccessibilityId("leftIconDaily");
		clickButton.click();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.resetApp();
		
		login1.Login();
		
		}

}
