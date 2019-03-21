package by.tut.ObjectRepository;

import by.tut.Selenium.SeleniumAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageRepo
{
    public static By btnLogin()
    {
        return By.xpath("//*[@data-target-popup='authorize-form']");
    }

    public static WebElement btnLogin(WebDriver driver)
    {
        WebElement element = SeleniumAction.Find(driver, btnLogin());
        return element;
    }

    public static By btnAccount()
    {
        return By.cssSelector(".uname");
    }

    public static WebElement btnAccount(WebDriver driver)
    {
        WebElement element = SeleniumAction.Find(driver, btnAccount());
        return element;
    }

    public static By btnEmail()
    {
        return By.xpath("//div[@data-popup='authorize-form']//a[contains(text(), 'Почта')]");
    }

    public static WebElement btnEmail(WebDriver driver)
    {
        WebElement element = SeleniumAction.Find(driver, btnEmail());
        return element;
    }

    public static By lblInboxNumber()
    {
        return By.cssSelector(".auth-ava>.count");
    }

    public static WebElement lblInboxNumber(WebDriver driver)
    {
        WebElement element = SeleniumAction.Find(driver, lblInboxNumber());
        return element;
    }
}
