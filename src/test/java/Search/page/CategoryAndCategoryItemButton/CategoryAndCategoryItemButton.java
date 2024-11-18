package Search.page.CategoryAndCategoryItemButton;

import Search.base.BaseTest;
import Search.constants.CategoryAndCategoryItemConstants.CategoryAndCategoryItemConstants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

public class CategoryAndCategoryItemButton extends BaseTest {
    private By CategoryButton = CategoryAndCategoryItemConstants.CategoryButton;
    private By CategoryItemButton = CategoryAndCategoryItemConstants.CategoryItemButton;
    private By CategoryItem2Button=CategoryAndCategoryItemConstants.CategoryItem2Button;
    private By AllFeaturesButton=CategoryAndCategoryItemConstants.AllFeaturesButton;


    public CategoryAndCategoryItemButton CategoryButton() throws InterruptedException {
        Thread.sleep(1000);
        click(CategoryButton);
        return this;
    }

    public CategoryAndCategoryItemButton CategoryItemButton() throws InterruptedException {
        Thread.sleep(1000);
        click(CategoryItemButton);
        return this;
    }
    public CategoryAndCategoryItemButton CategoryItem2Button() throws InterruptedException {
        Thread.sleep(1000);
        click(CategoryItem2Button);
        return this;

    }
    public CategoryAndCategoryItemButton AllFeaturesButton() throws InterruptedException{
        Thread.sleep(1000);
        scrollToFindElement();
        return this;
    }

    public void scrollToElement() {
        TouchAction touchAction = new TouchAction(driver);

        touchAction.press(PointOption.point(0, 1000))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, 50))
                .release()
                .perform();
    }
    public void scrollToFindElement() {
        while (true) {
            try {
                MobileElement allFeaturesButton = driver.findElement(AllFeaturesButton);
                if (allFeaturesButton.isDisplayed()) {
                    allFeaturesButton.click();
                    break;
                }
            } catch (NoSuchElementException e) {
                scrollToElement();
            }
        }
    }
}
