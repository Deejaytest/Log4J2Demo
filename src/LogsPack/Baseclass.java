package LogsPack;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.apache.logging.log4j.*;

public class Baseclass extends Log {

	public static AndroidDriver capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		log.info("Setting Capabilities");

		File f= new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G4");
		Cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),Cap);
		log.info("Capabilities are set and Driver has been initialised..");
		return driver;
		
	}

}
