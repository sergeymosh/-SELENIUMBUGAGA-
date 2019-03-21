package by.tut.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
    protected WebDriver driver;

    @BeforeMethod
    public void TestSetup()
    {
        System.setProperty("webdriver.chrome.driver", "./Selenium Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void TestCleanup()
    {
        driver.quit();
    }
}
