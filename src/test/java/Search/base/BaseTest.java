package Search.base;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static AndroidDriver<MobileElement> driver = null;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities =RunPIXEL();

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);
    }

    public static DesiredCapabilities getCommonCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\HP\\IdeaProjects\\TrendyolTest\\App\\trendyol-7-24-2-803.apk");
        return capabilities;
    }

    public static DesiredCapabilities RunPIXEL() {
        DesiredCapabilities capabilities = getCommonCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        return capabilities;
    }

    public static DesiredCapabilities RunTABLET() {
        DesiredCapabilities capabilities = getCommonCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Medium Tablet API 29");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        return capabilities;
    }

    public static DesiredCapabilities RunSMALLPHONE() {
        DesiredCapabilities capabilities = getCommonCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Small Phone API 29");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        return capabilities;
    }

    public static DesiredCapabilities RunPixel7Pro() {
        DesiredCapabilities capabilities = getCommonCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7 Pro");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        return capabilities;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }

    public void sendKeys(By by, String txt) {
        findElement(by).sendKeys(txt);
    }

    public void click(By by) {
        findElement(by).click();
    }
}
