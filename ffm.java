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

public class ffm extends book {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver;
		try {
			driver=book.main1();
			System.out.println("Test Case 1 : Should invoke the application using aapium server" );
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
//			1. Sign in and sign out
			try {
				boolean app_invoke = driver.findElementByAndroidUIAutomator("text(\"SIGN IN\")").isDisplayed();
				System.out.println(app_invoke);
				if(app_invoke=true) {
					System.out.println("Result:  App invoked!.. Status of test case 1 is   PASS  " + "\n" ); 
					System.out.println("Test Case 2 : It should Sign in into app using valid id and password" );
				}
				else {
					System.out.println("App did not invoke!.. Status of test case 1 is FAIL");
				}
			} catch(Exception e) {
				System.out.println("Sorry found an error: Please contact Shivam to solve this :(test case 1)");
			}
			
			driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("fieldforce");
			driver.hideKeyboard();
			driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("grampower");
			driver.hideKeyboard();
			driver.findElementByAndroidUIAutomator("text(\"SIGN IN\")").click();
			Thread.sleep(15000);
			
			try {
				boolean app_dashboard = driver.findElementsByClassName("android.widget.ImageButton").get(0).isDisplayed();
				System.out.println(app_dashboard);
				if(app_dashboard=true) {
					System.out.println("Result: Signed-IN !.. Status of test case 2 is   PASS  " + "\n" ); 
					System.out.println("Test Case 3 : User should sign-out from app using steps:" + "\n" 
							+ "1.Click on navigation drawer" + "\n"  + "2.Click on Profile" + "\n" + "3.Click on Setting" + "\n" 
							+ "4.Click on Log out" + "\n" + "5.Click Yes on pop-up"+ "\n" 
							+"Please Check each steps carefully" );
				}
				else {
					System.out.println("Sign-in fail !.. Status of test case 2 is FAIL");
				}
			} catch(Exception e) {
				System.out.println("Sorry found an error: Please contact Shivam to solve this :(test case 2)");
			}
			
			driver.findElementsByClassName("android.widget.ImageButton").get(0).click();
			Thread.sleep(2000);
			driver.findElementsByClassName("android.support.v7.widget.LinearLayoutCompat").get(3).click();
			Thread.sleep(2000);
			driver.findElementById("com.grampower.ffm:id/item_setting").click();
			Thread.sleep(2000);
			driver.findElementById("com.grampower.ffm:id/logout_layout").click();
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator("text(\"Yes\")").click();
			
//			2.Sign in then MArk attendance
			
			try {
				boolean login_screen = driver.findElementByAndroidUIAutomator("text(\"SIGN IN\")").isDisplayed();
				System.out.println(login_screen);
				if(login_screen=true) {
					System.out.println("Result:  Login Screen visible !.. Status of test case 3 is   PASS  " + "\n" ); 
					System.out.println("Test Case 4 : User should Mark-attendance and view attendance history from app using steps:" + "\n" 
							+ "1.Click on navigation drawer" + "\n"  + "2.Click on Attendance" + "\n"  + "3.Click on Yes on loaction access pop-up if gps loaction is not turned on" + "\n" 
							+ "4.Click on Start/End attendance" + "\n"  + "5.Click Yes on pop-up" + "\n" 
							+"Please Check each steps carefully" );
				}
				else {
					System.out.println("Login screen is not visible!.. Status of test case 3 is FAIL");
				}
			} catch(Exception e) {
				System.out.println("Sorry found an error: Please contact Shivam to solve this :(test case 3)");
			}
					
			driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("fieldforce");
			driver.hideKeyboard();
			driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("grampower");
			driver.hideKeyboard();
			driver.findElementByAndroidUIAutomator("text(\"SIGN IN\")").click();
			Thread.sleep(15000);
			
			driver.findElementsByClassName("android.widget.ImageButton").get(0).click();
			Thread.sleep(2000);
			driver.findElementsByClassName("android.support.v7.widget.LinearLayoutCompat").get(1).click();
			Thread.sleep(2000);
			
			try {
				boolean gps_location = driver.findElementByAndroidUIAutomator("text(\"OK\")").isDisplayed();
//				System.out.println(gps_location);
				if(gps_location=true) {
					driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
				}
			} catch(Exception e) {
				System.out.println("Not found the gps Location access pop up");
				
			}
			
//			try {
//				driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
//			} catch(Exception e) {
//				System.out.println("Not found");
//			}
////			
			Thread.sleep(2000);
			driver.findElementById("com.grampower.ffm:id/fl_attendance_layout").click();
			Thread.sleep(2000);
//			
//			try {
////			
////			boolean abc =  driver.findElementByAndroidUIAutomator("text(\"abc\")").isDisplayed();
////			System.out.println(abc);
//			driver.findElementByAndroidUIAutomator("text(\"abc\")").click();
//			} catch(Exception e) {
//				System.out.println("not displayed");
////
//			}
//////			
			driver.findElementByAndroidUIAutomator("text(\"Yes\")").click();
			Thread.sleep(2000);
			
			try {
				boolean app_permisson = driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").isDisplayed();
//				System.out.println(app_permisson);
				if(app_permisson=true) {
					driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
				}
			} catch(Exception e) {
				System.out.println("Not permisson requuired");
				
			}
//////
//			try {
//				driver.findElementByAndroidUIAutomator("text(\"ALLOW\")").click();
//			} catch(Exception e) {
//				System.out.println("Not found");
//			}
			Thread.sleep(16000);
			try {
				boolean retry_location = driver.findElementByAndroidUIAutomator("text(\"No\")").isDisplayed();
//				System.out.println(retry_location);
				if(retry_location=true) {
					driver.findElementByAndroidUIAutomator("text(\"No\")").click();
				}
			} catch(Exception e) {
				System.out.println("Location found in accuracy, no need to wait");
			
			}
//			try {
//				driver.findElementByAndroidUIAutomator("text(\"No\")").click();
//			} catch(Exception e) {
//				System.out.println("Not found");
//			}
////			
			Thread.sleep(2000);
			driver.findElementById("com.grampower.ffm:id/fab_attendance_history").click();
			
			try {
				boolean attendance_history = driver.findElementById("com.grampower.ffm:id/item_attendance_date_filter").isDisplayed();
				System.out.println(attendance_history);
				if(attendance_history=true) {
					System.out.println("Result:  Attenadance history screen invoked !.. Status of test case 4 is   PASS  " + "\n" ); 
					System.out.println("Test Case 5 : User shold view his task and add comment on task" );
				}
				else {
					System.out.println("App did not invoke!.. Status of test case 4 is FAIL");
				}
			} catch(Exception e) {
				System.out.println("Sorry found an error: Please contact Shivam to solve this :(test case 4)");
			}
			
			
			Thread.sleep(2000);
			
			driver.pressKeyCode(AndroidKeyCode.BACK);
			
//			driver.pressKeyCode(AndroidKeyCode.HOME);
			
//			
//			3.Task management
			
			
//			driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("fieldforce");
//			driver.hideKeyboard();
//			driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("grampower");
//			driver.hideKeyboard();
//			driver.findElementByAndroidUIAutomator("text(\"SIGN IN\")").click();
//			Thread.sleep(15000);
			driver.findElementsByClassName("android.widget.ImageButton").get(0).click();
			Thread.sleep(2000);
			driver.findElementsByClassName("android.support.v7.widget.LinearLayoutCompat").get(2).click();
			Thread.sleep(2000);
			driver.findElementById("com.grampower.ffm:id/item_drawer_opener_in_task_tab").click();
			Thread.sleep(2000);
			driver.findElementsById("com.grampower.ffm:id/rl_task_filter_view").get(1).click();
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator("text(\"FILTER\")").click();
			Thread.sleep(2000);

			try {
				boolean task_list = driver.findElementByClassName("android.widget.ImageView").isDisplayed();
				System.out.println(task_list);
				if(task_list=true) {
					driver.findElementById("com.grampower.ffm:id/item_drawer_opener_in_task_tab").click();
					Thread.sleep(2000);
					driver.findElementsById("com.grampower.ffm:id/rl_task_filter_view").get(0).click();
					Thread.sleep(2000);
					driver.findElementByAndroidUIAutomator("text(\"FILTER\")").click();
				}
//				else {
//					driver.findElementsById("com.grampower.ffm:id/ll_task_few_details").get(0).click();
//					Thread.sleep(2000);
//					driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("I have completed my task");
//					Thread.sleep(2000);
//					driver.findElementById("com.grampower.ffm:id/frl_send_comment").click();
//					Thread.sleep(2000);
//					driver.hideKeyboard();
//					driver.pressKeyCode(AndroidKeyCode.BACK);
//				}
				
			} catch(Exception e) {
				System.out.println("Found an error please contact shivam to solve");
				
			}
			
			driver.findElementsById("com.grampower.ffm:id/ll_task_few_details").get(2).click();
			Thread.sleep(2000);
//			driver.findElementById("com.grampower.ffm:id/fab_button").click();
//			Thread.sleep(2000);
//			driver.findElementById("com.grampower.ffm:id/ll_start_task").click();
			driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("I have completed my task");
			Thread.sleep(2000);
			driver.findElementById("com.grampower.ffm:id/frl_send_comment").click();
			Thread.sleep(2000);
			driver.hideKeyboard();
			
			try {
				boolean task_comment = driver.findElementById("com.grampower.ffm:id/fab_button").isDisplayed();
				System.out.println(task_comment);
				if(task_comment=true) {
					System.out.println("Result:  User has successfully added comment in task !.. Status of test case 5 is   PASS  " + "\n" ); 
					System.out.println("Test Case 6 : User should apply leave " );
				}
				else {
					System.out.println("App did not invoke!.. Status of test case 5 is FAIL  "  );
				}
			} catch(Exception e) {
				System.out.println("Sorry found an error: Please contact Shivam to solve this :(test case 5)");
			}
			
			Thread.sleep(2000);
			driver.pressKeyCode(AndroidKeyCode.BACK);
			driver.pressKeyCode(AndroidKeyCode.BACK);
			
			
//			4.Sign in and apply leave
			
			driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("fieldforce");
			driver.hideKeyboard();
			driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("grampower");
			driver.hideKeyboard();
			driver.findElementByAndroidUIAutomator("text(\"SIGN IN\")").click();
			Thread.sleep(15000);
////			
			driver.findElementsByClassName("android.widget.ImageButton").get(0).click();
			Thread.sleep(2000);
			driver.findElementsByClassName("android.support.v7.widget.LinearLayoutCompat").get(5).click();
			Thread.sleep(2000);
			driver.findElementById("com.grampower.ffm:id/fab_leave_request").click();
			Thread.sleep(2000);
			driver.findElementById("com.grampower.ffm:id/rb_one_day_leave").click();
			Thread.sleep(2000);
			driver.findElementById("com.grampower.ffm:id/et_one_day_leave_date_picker").click();
			Thread.sleep(2000);
			driver.findElementById("android:id/button1").click();
			Thread.sleep(2000);
			
//			AndroidElement spinnerList = (AndroidElement) driver.findElementById("com.grampower.ffm:id/bsp_verifier_emails"); 
			//where identifier would vary on how you can access the elements 
			
//			System.out.println(spinnerList + "abcd");
//			String spinnerListElementText =spinnerList.get(0).getText();
//			System.out.println(spinnerListElementText + "asxbsdj");
			
			driver.findElementById("com.grampower.ffm:id/et_reason_of_leave").sendKeys("This is for automation testing Please accept the request, leave requested by shivam");
			driver.hideKeyboard();
			Thread.sleep(2000);
			driver.findElementById("com.grampower.ffm:id/bsp_verifier_emails").click();

			Thread.sleep(5000);
			
			driver.findElementById("com.grampower.ffm:id/bt_submit_request").click();
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator("text(\"Yes\")").click();
			
			try {
				boolean apply_leave = driver.findElementById("com.grampower.ffm:id/fab_leave_request").isDisplayed();
				System.out.println(apply_leave);
				if(apply_leave=true) {
					System.out.println("Result:  User has successfully apply leave!.... Status of Test case 6 Pass" + "\n" ); 
				}
				else {
					System.out.println("App did not invoke!.. Status of test case 6 is FAIL  "  );
				}
			} catch(Exception e) {
				System.out.println("Sorry found an error: Please contact Shivam to solve this :(test case 6)");
			}
			
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		


	}

}
