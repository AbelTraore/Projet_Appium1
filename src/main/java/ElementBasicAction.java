import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class ElementBasicAction {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession_prof.initializeDriver("Android");


        By views = MobileBy.AccessibilityId("Views");
        By textFields = MobileBy.AccessibilityId("TextFields");
        By editText = MobileBy.id("io.appium.android.apis:id/edit");

        driver.findElement(views).click();

        for (int i=0; i<3; i++) {
            (new TouchAction(driver))
                    .press(new PointOption().withCoordinates(164, 1800))
                    .moveTo(new PointOption().withCoordinates(164, 200))
                    .release()
                    .perform();
        }

        driver.findElement(textFields).click();
        driver.findElement(editText).sendKeys("J'écris mon premier texte avec Appium");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // Thread.sleep(3000);
        driver.findElement(editText).sendKeys("2ème Texte");
       // Thread.sleep(3000);
        driver.findElement(editText).clear();

    }

}
