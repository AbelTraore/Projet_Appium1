import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CreateDriverSession_prof {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        caps.setCapability("newCommandTimeout", 120); //Durée d'attente d'une nouvelle commander avant de fermer le driver session

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        switch (platformName) {
            case "Android":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel6Pro");
                caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

                 // Installer l'application
                String appUrl = System.getProperty("user.dir") + "\\src\\main\\resources\\ApiDemos-debug.apk";
                caps.setCapability(MobileCapabilityType.APP, appUrl);

                //Déverouiller le téléphone
                caps.setCapability("unlockType", "pattern");
                caps.setCapability("unlockKey", "2580");

                return new AndroidDriver(url, caps);
            case"iOS":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                caps.setCapability(MobileCapabilityType.UDID, "9527463259a2c083dfc8062535b699a52b9b3cf9");
                caps.setCapability("xcodeOrgId", "L8T9J4R323");
                caps.setCapability("xcodeSigningId", "iPhone Developer");
//                String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
//                        + File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";
                caps.setCapability("simulatorStartupTimeout", 180000);
                caps.setCapability("bundleId", "com.ubercab.UberClient");
                caps.setCapability("includeSafariInWebviews", true);
                caps.setCapability("webviewConnectTimeout", "90000");
                return new IOSDriver(url, caps);
            default:
                throw new Exception("Invalid platform");

        }

    }

}
