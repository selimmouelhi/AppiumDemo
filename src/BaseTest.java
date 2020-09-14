import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest  extends  ExtentReportsD{
    public DesiredCapabilities dc;

    public DesiredCapabilities setCapabilities() throws MalformedURLException {
        ExtentReportsD ex= new ExtentReportsD();

            ex.reportSetup();

        dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.android.calculator2");
        dc.setCapability("appActivity",".Calculator");

        return dc;


    }

}
