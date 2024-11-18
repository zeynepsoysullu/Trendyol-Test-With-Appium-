package Search.page.GenderChooseButton;

import Search.base.BaseTest;
import Search.constants.GenderConstants.GenderConstants;
import org.openqa.selenium.By;

public class GenderChooseButton extends BaseTest {

    private By GenderButton = GenderConstants.GenderButton;


    public GenderChooseButton GenderButton() throws InterruptedException {
        Thread.sleep(1000);
        click(GenderButton);
        return this;
    }
}
