package Search.page.MyPageButton;

import Search.base.BaseTest;
import Search.constants.MyPageConstants.MyPageConstants;
import org.openqa.selenium.By;

public class MyPageButton extends BaseTest {

    private By AccountButton = MyPageConstants.AccountButton;

    public MyPageButton AccountButton() throws InterruptedException {
        Thread.sleep(1000);
        click(AccountButton);
        return this;
    }
}
