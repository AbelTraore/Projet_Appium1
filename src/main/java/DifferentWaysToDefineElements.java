import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DifferentWaysToDefineElements {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession_prof.initializeDriver("Android");

        MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Animation");
        System.out.println(myElement.getText());

        //WebElement myElement = driver.findElement(By.ById, "");
      WebElement myElement1 = (WebElement) driver.findElementByAccessibilityId("Animation");
      System.out.println(myElement1.getText());


        MobileElement myElement2 = (MobileElement) driver.findElementsById("android:id/text1").get(2);
        System.out.println(myElement2.getText());

        MobileElement myElement3 = (MobileElement) driver.findElementsByClassName("android.widget.TextView").get(3); //Attribut element class
        System.out.println(myElement3.getText());

        MobileElement myElement4 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Animation\"]" );  //XPath à construire
        System.out.println(myElement4.getText());

        // MobileElement myElement5 = (MobileElement) driver.findElementByTagName("Animation"); //nom
        // System.out.println(myElement5.getText());



        // Bonnes pratiques
        By myElement6 = MobileBy.AccessibilityId("Animation");
        System.out.println(driver.findElement(myElement6).getText());

    }

    //MobileElement, WebElement, By, MobileBy, @FindBy, @AndroidFindBy, @iosxcuITFindBy

}
