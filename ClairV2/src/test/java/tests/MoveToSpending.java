package tests;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;

public class MoveToSpending extends BaseClass{
	
	public void MoneyToSpending() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement toSpending1 = (MobileElement)driver.findElementByAccessibilityId("balancesSavings"); 
		toSpending1.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement toSpending2 = (MobileElement)driver.findElementByAccessibilityId("savingsAddToSpending"); 
		toSpending2.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement toSpending3 = (MobileElement)driver.findElementByAccessibilityId("transferInput"); 
		toSpending3.sendKeys("1");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement toSpending4 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]\"\n"
				+ "				+ \"/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]\"\n"
				+ "				+ \"/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]\"\n"
				+ "				+ \"/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/\"\n"
				+ "				+ \"android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]\"\n"
				+ "				+ \"/android.widget.ScrollView[1]/\"\n"
				+ "				+ \"android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]"); 
		toSpending4.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement toSpending5 = (MobileElement)driver.findElementByAccessibilityId("alertActionYes"); 
		toSpending5.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.resetApp();
		
		LogIn login3 = new LogIn();
		login3.Login();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}


}
