import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class telRan extends TestBase {

    @Test
        public void openTelRanTest() throws InterruptedException {
        //open site
        openSite("https://www.tel-ran.com/");
        Thread.sleep(500);
        //
        click(By.cssSelector("#comp-k2d3m6ja1linkElement"));
        return;
    }

    @Test
        public void testPrint(){
        driver.navigate().to("https://www.tel-ran.com/");
            String elementText=driver.findElement(By.xpath("//nav[@id='comp-k2d3m6janavContainer']")).getText();
            System.out.println(elementText);
        }
}




