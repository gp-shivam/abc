import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class book {
	
//	public static void main(String[]args) {
//		try {
//			AndroidDriver<AndroidElement> driver = book.main1();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public static AndroidDriver<AndroidElement> main1() throws MalformedURLException {
		// TODO Auto-generated method stub
		File appDir = new File("src");
//		File App = new File(appDir, "Grampower Android UnSigned Application for Automation Testing.apk");
		
//		ffm_app
		
		File App = new File(appDir, "v2.02.08_05_03_2019_v15_playstore.apk");
		
//		ffm_app
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, App.getAbsolutePath());
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		//return driver;
		return driver;
		
		
		
		// cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		// cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		// AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		// return driver;

	}

}
