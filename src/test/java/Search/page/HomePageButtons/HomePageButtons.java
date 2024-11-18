package Search.page.HomePageButtons;

import Search.base.BaseTest;
import Search.constants.HomepageConstants.HomePageConstants;
import org.openqa.selenium.By;


public class HomePageButtons extends BaseTest {
    private By EmptyClick = HomePageConstants.EmptyClick;
    private By HomePageButton = HomePageConstants.HomePageButton;



    public HomePageButtons EmptyClick() throws InterruptedException {
        Thread.sleep(1000);
        click(EmptyClick);
        return this;
    }

    public HomePageButtons HomePageButton() throws InterruptedException {
        Thread.sleep(1000);
        click(HomePageButton);
        return this;
    }
}
