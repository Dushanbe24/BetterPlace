package org.betterplace.pages;

import org.betterplace.utilities.BrowserUtils;
import org.betterplace.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class BasePF {

    public BasePF() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@class='btn btn-outline btn-large flex-grow mb-3']")
    public WebElement cookies;

    @FindBy(xpath = "//*[@name='amount_cents']")
    public WebElement Betrag;

    @FindBy(xpath = "//*[@name='amount_cents']")
    public WebElement einmaligBtn;

    @FindBy(xpath = "(//*[@class='generic-custom-radio'])[8]")
    public WebElement UberweisungBtn;

    @FindBy(id = "first_name")
    public WebElement getVorName;

    @FindBy(id = "last_name")
    public WebElement getNachName;

    @FindBy(css = "input#email")
    public WebElement Email;

    @FindBy(xpath = "(//*[@class='generic-custom-radio'])[9]")
    public WebElement BetragBtn;

    @FindBy(xpath = "(//*[@class='generic-custom-radio'])[10]")
    public WebElement nameBtn;

    @FindBy(xpath = "(//*[@class='generic-custom-radio'])[11]")
    public WebElement recieveReceipt;

    @FindBy(css = "select#country_alpha2")
    public WebElement country;

    @FindBy(id = "zip")
    public WebElement Plz;

    @FindBy(xpath = "//*[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//*[@name='street']")
    public WebElement Street;

    @FindBy(xpath = "(//*[@class='generic-custom-radio'])[12]")
    public WebElement Btn;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement largeBtn;

    @FindBy(xpath = "//*[@class='text-white mt-12 mb-205 desktop:mb-8']")
    public WebElement textWh;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-large']")
    public WebElement btnWeiter;


    public void acceptCookies() {
        cookies.click();
    }

    public void putMoney() throws InterruptedException {
        Betrag.click();
        Thread.sleep(1000);
        Betrag.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        einmaligBtn.click();
    }


    public void usePaymentMethod() {
        BrowserUtils.waitFor(3);
        getVorName.sendKeys("Firuza");
        getNachName.sendKeys("Kasirova");
        Email.sendKeys("firuza.kasirova@betterplace.org");
        BetragBtn.click();
        nameBtn.click();

    }

    public void setSelectCountry(String countryName) {
        BrowserUtils.waitFor(3);
        Select select = new Select(country);
        select.selectByVisibleText(countryName);


    }

    public void scrollDown() {
        Actions actions = new Actions(Driver.get());
        for (int i = 0; i < 3; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();

        }
    }

    public void fillInformation() {
        BrowserUtils.waitFor(5);
        Plz.sendKeys("15555");
        city.sendKeys("Santiago de Compostela");
        Street.sendKeys("Castinero 5");
        Btn.click();

    }

    public void clickLargeButton() throws InterruptedException {
        Thread.sleep(2000);
        largeBtn.click();

    }

    public void textWhite() {
        String expectResult = "Bitte überweise deinen Spendenbetrag an unten stehende Bankverbindung";
        String actualResult = textWh.getText().trim();

        Assert.assertEquals(actualResult, expectResult, "The message is not expected");

    }


    public void clickWeiter() {
        BrowserUtils.waitFor(5);
        btnWeiter.click();
    }

    public void getPaymentMethod() {
        BrowserUtils.waitFor(3);
        getVorName.sendKeys("123##");
        getNachName.sendKeys("@3444d");
        Email.sendKeys("kasiroova@gmail.com");

    }
}