package by.tut.Common;

import by.tut.ObjectRepository.HomepageRepo;
import by.tut.ObjectRepository.LoginFormRepo;
import by.tut.Selenium.SeleniumAction;
import org.openqa.selenium.WebDriver;

public class Homepage
{
    public static void Open(WebDriver driver)
    {
        SeleniumAction.Open(driver,"https://www.tut.by");
    }

    public static void Login(WebDriver driver, String login, String password)
    {
        SeleniumAction.WaitUntilExists(driver, HomepageRepo.btnLogin(), 60,"Login button");
        SeleniumAction.Click(HomepageRepo.btnLogin(driver), "Login button");
        SeleniumAction.WaitUntilExists(driver, LoginFormRepo.txtPassword(), 60,"Login field");
        SeleniumAction.EnterText(LoginFormRepo.txtLogin(driver), login);
        SeleniumAction.EnterText(LoginFormRepo.txtPassword(driver), password);
        SeleniumAction.Wait(1000);
        SeleniumAction.Click(LoginFormRepo.btnLogin(driver),"Login button in Login Form");
    }

    public static void OpenEmail(WebDriver driver)
    {
        SeleniumAction.WaitUntilExists(driver, HomepageRepo.btnAccount(),60,"Account opening button");
        SeleniumAction.Click(HomepageRepo.btnAccount(driver), "Account opening button");
        SeleniumAction.WaitUntilExists(driver, HomepageRepo.btnEmail(), 60,"Email button");
        SeleniumAction.Click(HomepageRepo.btnEmail(driver), "Email button");
    }

    public static void CheckInbox(WebDriver driver)
    {
        boolean result = SeleniumAction.WaitUntilExists(driver, HomepageRepo.lblInboxNumber(),20,
                "Number of incoming mails");

        if (result)
        {
            String numberOfMails = SeleniumAction.GetText(HomepageRepo.lblInboxNumber(driver));
            System.out.println("INFO: You have "+ numberOfMails + " new incoming messages");
        }
        else
        {
            System.out.println("WARN: You don't have new incoming messages or mailbox wasn't loaded");
        }
    }
}
