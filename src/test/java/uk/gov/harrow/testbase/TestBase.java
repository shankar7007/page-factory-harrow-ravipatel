package uk.gov.harrow.testbase;/*
 * Ravi Creation
 * Date of Creaction
 */

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.gov.harrow.browserselector.BrowserSelector;
import uk.gov.harrow.pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TestBase extends HomePage{


    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://www.harrow.gov.uk/";

    @BeforeMethod
    public  void openBrowser(){
        browserSelector.selectBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @AfterMethod

    public void closeBrowser(){
        driver.quit();
    }
}
