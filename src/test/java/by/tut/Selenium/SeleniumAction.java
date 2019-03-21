package by.tut.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAction
{
    public static void Open(WebDriver driver, String url)
    {
        System.out.println("INFO: Opening our webpage -'"+url+"'");
        driver.get(url);
    }

    public static boolean WaitUntilExists(WebDriver driver, By elementLocator, long timeToWait, String elementName)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeToWait);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
        boolean result = element.isDisplayed();

        if (result)
        {
            System.out.println("SUCCESS: Element loaded - '"+ elementName + "'");
        }
        else
        {
            System.out.println("ERROR: Element not loaded - '"+ elementName + "'");
        }

        return result;
    }

    public static WebElement Find(WebDriver driver, By elementLocator)
    {
        WebElement element = driver.findElement(elementLocator);
        return  element;
    }

    public static void Click(WebElement element, String elementName)
    {
        System.out.println("INFO: Clicking on element - '"+ elementName + "'");
        element.click();
    }

    public static void EnterText(WebElement element, String text)
    {
        System.out.println("INFO: Entering text - '"+ text + "'");
        element.sendKeys(text);
    }

    public static String GetText(WebElement element)
    {
        String containedText = element.getText();
        return containedText;
    }

    public static void Wait(long timeToWait)
    {
        try
        {
            System.out.println("INFO: Waiting for"+timeToWait+"...");
            Thread.sleep(timeToWait);
        }
        catch (InterruptedException e)
        {
            System.out.println("WARN: Waiting was interrupted!");
            e.printStackTrace();
        }
    }
}
