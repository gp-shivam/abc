
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class consumerAppAutomation extends book {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver;
		try {
			driver=book.main1();
			System.out.println("Test Case 1 : Should invoke the application using aapium server" );
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("7073633956");
			driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("grampower");
			driver.hideKeyboard();
			Thread.sleep(10000);
			driver.findElementByAndroidUIAutomator("text(\"Sign In\")").click();
////			driver.findElementByXPath("//android.widget.Button[@bound='[90,1334][990,1484]']").click();
//			WebElement	 abc = driver.findElementByXPath("//android.widget.Button[@bound='[90,1334][990,1484]']");
//			abc.click();
					
			
//			Thread.sleep(5000);
			driver.pressKeyCode(AndroidKeyCode.MENU);
//			System.out.println(driver.getPageSource());
//			Thread.sleep(5000);
			
//			driver.pressKeyCode(AndroidKeyCode.MENU);
//			driver.pressKeyCode(AndroidKeyCode.KEYCODE_MENU)
//			driver.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_1);
//			driver.findElementsById("android.widget.ListView").get(0).click();
//			Thread.sleep(2000);
//			
//			
//			List<AndroidElement> list = driver.findElementsById("android.widget.ListView");
//			for (int i=0; i<list.size() ; i++) {
//				System.out.println("List element "+ i  + " value:" + list.get(i));
//			
//			}
////			((AndroidElement) list).click();
//			list.get(0).click();
			
			
			
//			List<AndroidElement> list = driver.findElementsById("android.widget.ListView");
//			for (int i=0; i<list.size() ; i++) {
//				System.out.println("List element "+ i  + " value:" + list.get(i));
//			
//			}
////			((AndroidElement) list).click();
//			list.get(0).click();
						
			
//			driver.pressKeyCode(AndroidKeyCode.KEYCODE_BUTTON_2);
//			driver.pressKeyCode(AndroidKeyCode.);
			
//			
//			Thread.sleep(5000);
//			driver.getPageSource();
//			Thread.sleep(2000);
//			System.out.println(driver.getPageSource());
		
//			System.out.println("HIHIHIHI");
//			driver.getPageSource();
		
		
//			Thread.sleep(5000);
//			System.out.println(driver.getPageSource());
//			Thread.sleep(5000);
//			driver.findElementByXPath("(\\android.widget.Button)[1]").click();
//			driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("100");
//			driver.findElementByAndroidUIAutomator("text(\"₹ 120\")").click();
//			
			
			
//			TouchAction tc = new TouchAction(driver);
//			 
//		WebElement expandList = driver.findElementById("com.grampower.consumerapp.wifismartmeterapp:id/rlRechargeHistory");
////			WebElement expandList = driver.findElementByAndroidUIAutomator("text(\"Sign In\")");
//			WebElement expandlist = driver.findElementByXPath("//android.widget.Button[@bound='[90,1334][990,1484]']");
//		
//			tc.tap(tapOptions().withElement(element(expandList))).perform();
//			tc.tap(tapOptions().withPosition((PointOption(expandlist)).perform();
			
		

//			System.out.println(driver.getPageSource());
//			driver.findElementByAndroidUIAutomator("text(\"Explore\")").click();
//			 driver.findElementById("crtv_explore").click();
			// driver.findElementByAndroidUIAutomator("text(\"Mar'19\")").click();
			
//			 driver.findElementsByClassName("android.widget.LinearLayout").get(1).click();
//			driver.findElementByXPath("//*[content-desc='More options']").click();
//			driver.findElementById("com.grampower.consumerapp.wifismartmeterapp:id/alertIconWithDot").click();
//			driver.findElementById("com.grampower.consumerapp.wifismartmeterapp:id/alertIconWithoutDot").click();
			
//			driver. findElementByAccessibilityId(“plus”);
//			driver.findElementByXPath("android.widget.TextView[@text='₹ 1,254']").click();
			
			// driver.findElementById("resource-id:/rlRecharge").click();
//			driver.findElementsByClassName("android.widget.ImageButton").get(0).click();
			
//			driver.findElementByXPath("(//android.widget.RelativeLayout)[1]").click();
//			driver.findElementByXPath("(//android.widget.RelativeLayout)").click();
//			driver.findElementById("com.grampower.consumerapp.wifismartmeterapp:id/rlRecharge").click();
//			Thread.sleep(7000);
			
//			driver.findElementById("com.grampower.consumerapp.wifismartmeterapp:id/llPersonalInformation").click();
//			driver.findElementByAndroidUIAutomator("text(\"EDIT\")").click();
//			driver.findElementById("com.grampower.consumerapp.wifismartmeterapp:id/alertIconWithoutDot").click();
//			driver.findElementsByClassName("android.widget.ImageView").get(0).click();
//			driver.findElementById("com.grampower.consumerapp.wifismartmeterapp:id/rlBillingInfo").click();	
//			driver.findElementById("com.grampower.consumerapp.wifismartmeterapp:id/rlTotalBillPayment").click();
//			driver.findElementsByClassName("android.widget.ImageButton").get(0).click();
//			
//			driver.findElementById("com.grampower.consumerapp.wifismartmeterapp:id/llLogout").click();
//			Thread.sleep(7000);
//			
//			driver.findElementByAndroidUIAutomator("text(\"Yes\")").click();
			
			
//			driver.findElement(By.id(“com.android.calculator2:id/digit5”)).click();
//			driver.findElement(By.id(“com.grampower.consumerapp.wifismartmeterapp:id/rlRecharge”)).click();
			
//			TouchActions t=new TouchActions(driver);
			
			
//			driver.findElement(By.id("com.grampower.consumerapp.wifismartmeterapp:id/rlRecharge")).click();
			
//			driver.findElementsByClassName("android.widget.RelativeLayout").get(1).click();;
//			driver.findElementByXPath("//*[resource-id=com.grampower.consumerapp.wifismartmeterapp:id/rlRecharge]").click();
//			driver.findElement(By.id("com.grampower.consumerapp.wifismartmeterapp:id/rlRecharge")).click();
			
			// driver.findElementByXPath("android.widget.TextView[@text='Explore']").click();
			
			// id = com.grampower.consumerapp.wifismartmeterapp:id/rlRecharge
			// class = android.widget.RelativeLayout
			
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		


	}

}

