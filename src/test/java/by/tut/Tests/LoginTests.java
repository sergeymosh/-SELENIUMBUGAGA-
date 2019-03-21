package by.tut.Tests;

import by.tut.Common.Homepage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest
{
    @Test
    public void LoginTest001()
    {
        System.out.println("TEST: Check that existing user has new inbox mails");
        Homepage.Open(driver);
        Homepage.Login(driver, "testmudila228@tut.by","qweasdzxc123");
        Homepage.CheckInbox(driver);
    }
}
