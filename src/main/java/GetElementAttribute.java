import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class GetElementAttribute {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession_prof.initializeDriver("Android");

        By animation = MobileBy.AccessibilityId("Animation");
        By views= MobileBy.AccessibilityId("Views");
        By textFields= MobileBy.AccessibilityId("TextFields");


        System.out.println("text = " + driver.findElement(animation).getText());
        System.out.println("selected = " + driver.findElement(animation).getAttribute("selected"));
        System.out.println("checkable = " + driver.findElement(animation).getAttribute("checkable"));

        System.out.println("visible = " + driver.findElement(animation).isDisplayed());

        driver.findElement(views).click();

       // System.out.println("TextFields visible = " + driver.findElement(textFields).isDisplayed());

    }
}
