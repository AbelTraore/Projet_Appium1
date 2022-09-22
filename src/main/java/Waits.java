import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession_prof.initializeDriver("Android");


        //implicit Waits
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        By textFields = MobileBy.AccessibilityId("TextFields");


        driver.findElement(views).click();
/*
        for (int i=0; i<3; i++) {
            (new TouchAction(driver))
                    .press(new PointOption().withCoordinates(164, 1800))
                    .moveTo(new PointOption().withCoordinates(164, 200))
                    .release()
                    .perform();
        }*/
        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(textFields)).click();
        //driver.findElement(textFields).click();
    }

}
