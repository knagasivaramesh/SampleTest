package Testmaven.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.After;
import org.junit.Rule;

import TestMobile.Objects.TestAndroidConstants.flipkart;

import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.MobileElement;





public class TestAppiumSample {
	
	public static EnhancedAndroidDriver<MobileElement> driver;
	@Rule
    public TestWatcher watcher = Factory.createWatcher();
 
	@Test
	public static void M1() throws MalformedURLException, Exception {
		Thread.sleep(10000);
		//System.out.println("appStrated");
		// TODO Auto-generated method stub
		//File appDir = new File("/Users/nishant/Development/AppiumDemo/apps");
			//File app = new File("src/main/resources/App_APK/Flipkart.apk");
	        DesiredCapabilities cap =new DesiredCapabilities();
	        /*cap.setCapability("device","Android");
	        //mandatory capabilities
	        //cap.setCapability("deviceName","Google Pixel XL");
	        cap.setCapability("deviceName","Galaxy J2(2016)");
	        cap.setCapability(CapabilityType.PLATFORM,"Android");
	        cap.setCapability("app", app.getAbsolutePath());
	        cap.setCapability("platformName", "Android");
	        //cap.setCapability("platformVersion","8.0.0");
	        cap.setCapability("platformVersion","6.0.1");
	        cap.setCapability(MobileCapabilityType.UDID,"420062a2ccbb6300");
	        cap.setCapability("automationName","Appium");*/
	        cap.setCapability("appPackage","com.flipkart.android");
	       // System.out.println("appPackage");
	        driver = Factory.createAndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	        //AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	        //Enter User-Name Screen
	        //driver = Factory.createAndroidDriver(new URL(url), cap);
	        driver.findElement(By.xpath(flipkart.input_MobileNo)).click();
	        driver.findElement(By.xpath(flipkart.input_MobileNo)).sendKeys("9492979097");
	        driver.findElement(By.xpath(flipkart.btn_SignUP)).click();
	        driver.findElement(By.xpath(flipkart.input_Password)).click();
	        driver.findElement(By.xpath(flipkart.input_Password)).sendKeys("ramesh");
	        driver.findElement(By.xpath(flipkart.btn_login)).click();
	        driver.findElement(By.xpath(flipkart.icon_Menu)).click();
	        driver.findElement(By.xpath(flipkart.btn_MyCart)).click();
	        
			Thread.sleep(5000);	
	        
	        
		}
	@After
    public void TearDown(){
        driver.label("Stopping App");
        driver.quit();
    }
	/*@After
    public void TearDown(){
        //driver.label("Stopping App");
        driver.quit();
    }*/
	
	/*@After
    public void TearDown(){
        driver.label("Stopping App");
        driver.quit();
    }*/
}
