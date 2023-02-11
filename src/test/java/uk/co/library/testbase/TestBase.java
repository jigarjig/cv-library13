package uk.co.library.testbase;

import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.InterruptedIOException;


public class TestBase extends Utility {


    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() throws InterruptedIOException, InterruptedException {
        selectBrowser(browser);
       //new Utility().acceptCookiesAndSwitchToIframe();
        //new Utility().acceptCookiesandSwitchToIframe();

    }


    @AfterMethod
    public void tearDown(){
        //closeBrowser();
    }
}
