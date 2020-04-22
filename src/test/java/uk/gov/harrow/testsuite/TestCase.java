package uk.gov.harrow.testsuite;/*
 * Ravi Creation
 * Date of Creaction 19/04/20
 */

import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

public class TestCase extends TestBase{
    HomePage homePage = new HomePage();
    @Test
    public void userShouldclickOnloginOrRegisterLink(){
        homePage.clickOnLoginRegisterLink();
    }
    @Test
    public void userShouldclickOnservicesBtn(){
        homePage.clickOnServiceBtn();
    }







}
