package resources.testdata;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;

public class TestData {

    //private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @DataProvider(name = "JobsFound")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow",1, "30000","50000", 1, 1}};

        return data;
    }
}
