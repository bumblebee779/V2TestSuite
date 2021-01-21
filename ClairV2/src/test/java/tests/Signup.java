package tests;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import scrolling.Scrolling;



import io.appium.java_client.MobileElement;


public class Signup extends BaseClass{
	//to enter the verification code
	@Test (priority = 0)
	public void SignupVerifyCode() {

		MobileElement e1 = (MobileElement) driver.findElementByAccessibilityId("welcomeSignUp");
		e1.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		MobileElement e4 = (MobileElement) driver.findElementByAccessibilityId("accordionWrapper");
		e4.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		MobileElement e5 = (MobileElement) driver.findElementByAccessibilityId("oneInput0");
		e5.sendKeys("7");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		MobileElement e6 = (MobileElement) driver.findElementByAccessibilityId("oneInput1");
		e6.sendKeys("9");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		MobileElement e7 = (MobileElement) driver.findElementByAccessibilityId("oneInput2");
		e7.sendKeys("9");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		MobileElement e8 = (MobileElement) driver.findElementByAccessibilityId("oneInput3");
		e8.sendKeys("1");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		MobileElement e9 = (MobileElement) driver.findElementByAccessibilityId("oneInput4");
		e9.sendKeys("1");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		MobileElement e10 = (MobileElement) driver.findElementByAccessibilityId("oneInput5");
		e10.sendKeys("8");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e11 = (MobileElement) driver.findElementByAccessibilityId("verifyCodeContinue");
		e11.click();

	}
	//to enter the info on the first screen of signup flow
	@Test (priority = 1)
	public void SignupEnterLoginInfo() throws MalformedURLException, InterruptedException{

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e13 = (MobileElement) driver.findElementByAccessibilityId("contactInfoPhoneInput");
		e13.sendKeys("9176776652");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e12 = (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]");
		e12.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e14 = (MobileElement) driver.findElementByAccessibilityId("contactInfoPasswordInput");
		e14.sendKeys("Anany@2020!");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.hideKeyboard();


		MobileElement e15 = (MobileElement) driver.findElementByAccessibilityId("contactInfoConfirmPasswordInput");
		e15.sendKeys("Anany@2020!");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}
	//to scroll down on the login info screen
	@Test (priority = 2)
	public void scrollNow() {
		Scrolling scrolling = new Scrolling();
		scrolling.scrollDown();

	}
	//to click Continue after scrolling down on the login info screen
	@Test (priority = 3)
	public void clickInfoCont() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e16 = (MobileElement) driver.findElementByAccessibilityId("contactInfoContinue");
		e16.click();
	}
	//to enter info on the Personal Info section
	@Test (priority = 4)
	public void SignupEnterPersonalInfo() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e17 = (MobileElement) driver.findElementByAccessibilityId("personalInfoFirstNameInput");
		e17.sendKeys("Bumble");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e18 = (MobileElement) driver.findElementByAccessibilityId("personalInfoLastNameInput");
		e18.sendKeys("Bee");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e19 = (MobileElement) driver.findElementByAccessibilityId("personalInfoDOBInput");
		e19.sendKeys("01021995");


		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e20 = (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[6]/android.view.ViewGroup[1]/android.widget.TextView[1]");
		e20.click();

		MobileElement e21 = (MobileElement) driver.findElementByAccessibilityId("personalInfoContinue");
		e21.click();

	}
	@Test (priority = 5)
	public void SignupEnterMailingAddress() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e22 = (MobileElement) driver.findElementByAccessibilityId("mailingContinue");
		e22.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e23 = (MobileElement) driver.findElementByAccessibilityId("alertActionNo");
		e23.click();

	}
	@Test(priority = 6)
	public void SignupEnterPermAddress() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e24 = (MobileElement)driver.findElementByAccessibilityId("permanentSameAddressCheckbox");
		e24.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test (priority = 7)
	public void scrollNow1() {
		Scrolling scrolling = new Scrolling();
		scrolling.scrollDown();

	}
	@Test (priority = 8)
	public void billingCont() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e25 = (MobileElement) driver.findElementByAccessibilityId("billingContinue");
		e25.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MobileElement e26 = (MobileElement) driver.findElementByAccessibilityId("alertActionYes");
		e26.click();
	}
	@Test (priority = 9)	
	public void EmploymentScreen() {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e27 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[7]"
				+ "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.widget.Spinner[1]/android.widget.TextView[1]"); 
		e27.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e28 = (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.ListView[1]/android.widget.CheckedTextView[3]");
		e28.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e29 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.view.ViewGroup[7]/android.view.ViewGroup[2]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"
				+ "/android.view.ViewGroup[2]/android.widget.Spinner[1]/android.widget.TextView[1]"); 
		e29.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e30 = (MobileElement)driver.findElementByXPath("//hierarchy/android.widget.FrameLayout[1]"
				+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.FrameLayout[1]/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.FrameLayout[1]"
				+ "/android.widget.ListView[1]/android.widget.CheckedTextView[5]"); 
		e30.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e31 = (MobileElement)driver.findElementByAccessibilityId("workInfoContinue"); 
		e31.click();

	}
	
	@Test(priority = 10)
	public void SsnScreen() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e32 = (MobileElement)driver.findElementByAccessibilityId("SSNInput0"); 
		e32.sendKeys("7");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e33 = (MobileElement)driver.findElementByAccessibilityId("SSNInput1"); 
		e33.sendKeys("7");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e34 = (MobileElement)driver.findElementByAccessibilityId("SSNInput2"); 
		e34.sendKeys("7");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e35 = (MobileElement)driver.findElementByAccessibilityId("SSNInput3"); 
		e35.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e36 = (MobileElement)driver.findElementByAccessibilityId("SSNInput4"); 
		e36.sendKeys("7");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e37 = (MobileElement)driver.findElementByAccessibilityId("SSNInput5"); 
		e37.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e38 = (MobileElement)driver.findElementByAccessibilityId("SSNInput6"); 
		e38.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e39 = (MobileElement)driver.findElementByAccessibilityId("SSNInput7"); 
		e39.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e40 = (MobileElement)driver.findElementByAccessibilityId("SSNInput8"); 
		e40.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		MobileElement e41 = (MobileElement)driver.findElementByAccessibilityId("SSNConfirmInput0"); 
		e41.sendKeys("7");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e42 = (MobileElement)driver.findElementByAccessibilityId("SSNConfirmInput1"); 
		e42.sendKeys("7");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e43 = (MobileElement)driver.findElementByAccessibilityId("SSNConfirmInput2"); 
		e43.sendKeys("7");;
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e44 = (MobileElement)driver.findElementByAccessibilityId("SSNConfirmInput3"); 
		e44.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e45 = (MobileElement)driver.findElementByAccessibilityId("SSNConfirmInput4"); 
		e45.sendKeys("7");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e46 = (MobileElement)driver.findElementByAccessibilityId("SSNConfirmInput5"); 
		e46.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e47 = (MobileElement)driver.findElementByAccessibilityId("SSNConfirmInput6"); 
		e47.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e48 = (MobileElement)driver.findElementByAccessibilityId("SSNConfirmInput7"); 
		e48.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e49 = (MobileElement)driver.findElementByAccessibilityId("SSNConfirmInput8"); 
		e49.sendKeys("8");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e50 = (MobileElement)driver.findElementByAccessibilityId("ssnCollectConcealToggle"); 
		e50.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e51 = (MobileElement)driver.findElementByAccessibilityId("ssnCollectContinue"); 
		e51.click();
	}
	
	@Test(priority = 11)
	public void scrollNow2() {
		Scrolling scrolling = new Scrolling();
		scrolling.scrollDownReview();
	}
	
	@Test(priority = 12)
	public void clickReviewsubmit() {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e52 = (MobileElement)driver.findElementByAccessibilityId("rightIconReviewShowSSN"); 
		e52.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		MobileElement e53 = (MobileElement)driver.findElementByAccessibilityId("leftIconReviewAgreeTerms"); 
		e53.click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//MobileElement e54 = (MobileElement)driver.findElementByAccessibilityId("reviewSubmit"); 
		//e54.click();
		 
		driver.resetApp();
	}
	
	
	
	
	public void ConfirmCard() {
		
	}
	
	public void AccountClosure() {
		
	}
}


