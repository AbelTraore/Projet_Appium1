import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AndroidFindElement {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession_prof.initializeDriver("Android");

        MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Animation");
        System.out.println(myElement.getText());
        //WebElement myElement = driver.findElement(By.ById, "");
    }
}
