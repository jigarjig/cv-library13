package uk.co.library.testsuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void inIT() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test
    public void test() {
        driver.switchTo().frame("gdpr-consent-notice");
        homePage.clickOnAccept();
        driver.switchTo().defaultContent();
        homePage.enterJobTitle("software tester");
        homePage.enterLocation("ha3 9rf");
        homePage.selectDistance(String.valueOf(Integer.parseInt("100")));
        homePage.clickOnMoreoptions();
        homePage.enterMinSalary("30000");
        homePage.enterMaxSalary("50000");
        homePage.selectSalaryTypeDropDown(1);
        homePage.selectJobTypeDropDown(1);
        homePage.clickOnSearchButton();

        resultPage.getResultText();
        String expected = resultPage.getResultText();
        String actualText = resultPage.getResultText();
        Assert.assertEquals(expected, actualText, "Result of searching Jobs");

    }

    }









