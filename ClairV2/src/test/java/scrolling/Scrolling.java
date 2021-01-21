package scrolling;



import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import tests.BaseClass;

public class Scrolling extends BaseClass{
	
	public void scrollDown() {
		
		new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 60)).release().perform();
	
}
	public void scrollDownReview() {
		
		
		new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 60)).release().perform();
		new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 60)).release().perform();
		new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 60)).release().perform();
		new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 60)).release().perform();
		
	}
}