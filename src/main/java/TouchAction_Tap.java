import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TouchAction_Tap {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession_prof.initializeDriver("Android");


        //implicit Waits
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");

        TouchAction t = new TouchAction(driver);
        //t.tap(ElementOption.element(driver.findElement(views))).perform();
        //t.tap(PointOption.point(518, 800)).perform();
        t.press(ElementOption.element(driver.findElement(views)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(10000))).release().perform();

    }



}
