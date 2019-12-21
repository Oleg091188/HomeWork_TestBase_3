import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void openSite(String url) {
        driver.navigate().to(url);
    }

    public void click(By locator) throws InterruptedException {
        driver.findElement(locator).click();
        Thread.sleep(5000);

        driver.findElement(locator).click();
        Thread.sleep(5000);

        driver.findElement(locator).click();
        Thread.sleep(5000);

        driver.findElement(locator).click();
        Thread.sleep(5000);

        driver.findElement(locator).click();
        Thread.sleep(5000);

        driver.findElement(locator).click();
        Thread.sleep(5000);
    }
}
