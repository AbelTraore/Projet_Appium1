import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession_IntalledApp {


    public static void  main(String[] args) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
/**
 caps.setCapability("platformName", "Android");
 caps.setCapability("deviceName", "Pixel6Pro");
 caps.setCapability("udid", "emulator-5554");
 caps.setCapability("app", "C:\\Users\\Administrateur\\Desktop\\ApiDemos-debug.apk");
 **/


        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel6Pro");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        //String appUrl = System.getProperty("user.dir") + "\\src\\main\\resources\\ApiDemos-debug.apk";
        // "C:\\Users\\Administrateur\\IdeaProjects\\Projet_Appuim\\src\\main\\resources\\ApiDemos-debug.apk"
        //caps.setCapability(MobileCapabilityType.APP, appUrl);

        caps.setCapability("appPackage", "io.appium.android.apis");
        caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        //Lancer android virtual device
        caps.setCapability("avd", "Pixel_6_Pro_API_33");
        caps.setCapability("avdLaunchTimeout", 180000);



        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AppiumDriver driver = new AndroidDriver(url, caps);

    }


}
