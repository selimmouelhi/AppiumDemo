import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ExtentReportsD {

    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;

    @BeforeSuite
    public ExtentReports reportSetup(){

        // start reporters
         htmlReporter = new ExtentHtmlReporter("extent.html");

        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return  extent;

    }


    @AfterSuite
    public void reportTearDown(){

        extent.flush();

    }
}
