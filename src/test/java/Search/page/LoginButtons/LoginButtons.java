package Search.page.LoginButtons;

import Search.base.BaseTest;
import Search.constants.LoginConstants.LoginConstants;
import org.openqa.selenium.By;

public class LoginButtons extends BaseTest {
    private By EmailButton = LoginConstants.EmailButton;
    private By PasswordButton = LoginConstants.PasswordButton;
    private By LoginButton = LoginConstants.LoginButton;


    public LoginButtons EmailButton() throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(EmailButton, "syzeynep14@gmail.com");
        return this;
    }

    public LoginButtons PasswordButton() throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(PasswordButton, "sy123zey..");
        return this;
    }

    public LoginButtons LoginButton() throws InterruptedException {
        Thread.sleep(1000);
        click(LoginButton);
        return this;
    }
}
