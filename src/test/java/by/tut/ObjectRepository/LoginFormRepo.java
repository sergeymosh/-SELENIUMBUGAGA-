package by.tut.ObjectRepository;

import by.tut.Selenium.SeleniumAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFormRepo
{
    public static By txtLogin()
    {
        return By.xpath("//*[@class='i-holder']/*[@name='login']");
    }

    public static WebElement txtLogin(WebDriver driver)
    {
        WebElement element = SeleniumAction.Find(driver, txtLogin());
        return element;
    }

    public static By txtPassword()
    {
        return By.xpath("//*[@class='i-holder']/*[@name='password']");
    }

    public static WebElement txtPassword(WebDriver driver)
    {
        WebElement element = SeleniumAction.Find(driver, txtPassword());
        return element;
    }

    public static By btnLogin()
    {
        return By.xpath("//*[@class='button auth__enter']");
    }

    public static WebElement btnLogin(WebDriver driver)
    {
        WebElement element = SeleniumAction.Find(driver, btnLogin());
        return element;
    }
}
