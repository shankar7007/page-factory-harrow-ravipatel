package uk.gov.harrow.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //By loginOrRegisterLink = By.linkText("Log in / Register");
    //By servicesBtn = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");
    @FindBy(linkText = "Log in / Register")
    WebElement _loginOrRegisterLink;
    @FindBy(xpath = "//span[@class='button__text'][contains(text(),'Services')]")
    WebElement _serviceBtn;
    public void clickOnLoginRegisterLink(){
        Reporter.log("clickOnLoginRegisterLink"+_loginOrRegisterLink.toString()+"<br>");
        clickOnElement(_loginOrRegisterLink);
        log.info("clickOnLoginRegisterLink"+_loginOrRegisterLink.toString());
    }
    public void clickOnServiceBtn(){
        Reporter.log("clickOnServiceBtn"+_serviceBtn.toString()+"<br>");
        clickOnElement(_serviceBtn);
        log.info("clickOnServiceBtn"+_serviceBtn.toString());
    }
}
