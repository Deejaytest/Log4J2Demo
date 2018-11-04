package LogsPack;
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class TestClass extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {

		try

		{
			AndroidDriver driver=capabilities();
			Log.startTestCase("Appium_Test_Case_001");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			log.info("Implicit wait applied on the driver for 10 seconds");
			driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
			log.info("Preferences Button clicked on Home Page");
			driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
			log.info("Prefernces Dependencies Clicked");
			driver.findElementById("android:id/checkbox").click();
			log.info("Checkbox clicked.");
			driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
			log.info("Button clicked");
			driver.findElementByClassName("android.widget.EditText").sendKeys("First Input");
			log.info("Text entered in the popup");
			driver.findElementById("android:id/button1").click();
			log.info("OK button clicked in the popup");
			Log.endTestCase("Appium_Test_Case_001");
		}catch(Exception e){
			log.error("Exception occured! Element not found", e);
			throw(e);
		}
		
		
}
}


	