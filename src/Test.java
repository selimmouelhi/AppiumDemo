import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class Test extends BaseTest  {
    public AndroidDriver<AndroidElement> ad;

    @org.testng.annotations.Test
    public void testAdditionInCalculator() throws MalformedURLException {
        BaseTest bt = new BaseTest();

        ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),bt.setCapabilities());
        ExtentReportsD ex  =new ExtentReportsD();

         ExtentTest test = ex.reportSetup().createTest("test addition", "this test will verify if addition works fine");

        test.log(Status.INFO,"test has just started");
        MobileElement el2 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_1");
        el2.click();
       test.log(Status.PASS,"click on digit 1");


        MobileElement el3 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_7");
        el3.click();
      test.log(Status.PASS,"click on digit 7");

        MobileElement el4 = (MobileElement) ad.findElementByAccessibilityId("plus");
        el4.click();
        test.log(Status.PASS,"click on add");

        MobileElement el5 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_1");
        el5.click();

        test.log(Status.PASS,"click on digit 1");

        MobileElement el6 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_7");
        el6.click();

         test.log(Status.PASS,"click on digit 7");

        MobileElement el7 = (MobileElement) ad.findElementByAccessibilityId("equals");
        el7.click();

      test.log(Status.PASS,"click on equals");



        Assert.assertEquals(ad.findElementById("com.android.calculator2:id/result").getText(),"34");

       test.log(Status.PASS,"assert equals to the expected value");
       test.log(Status.INFO,"test completed");

        ex.reportTearDown();



    }




}
