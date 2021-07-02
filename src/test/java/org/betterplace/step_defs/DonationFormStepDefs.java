package org.betterplace.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.betterplace.pages.BasePF;
import org.betterplace.utilities.BrowserUtils;
import org.betterplace.utilities.ConfigurationReader;
import org.betterplace.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DonationFormStepDefs {

    BasePF basePF = new BasePF();
    WebDriverWait webDriverWait= new WebDriverWait(Driver.get(),10);


    @Given("I visited donation Portal site")
    public void I_visited_donation_Portal_site() {
        Driver.get().get(ConfigurationReader.getValue("url_succeed"));
        BrowserUtils.waitFor(3);
        basePF.acceptCookies();

    }

    @When("I should prepare a donation of money")
    public void I_should_prepare_a_donation_of_money() throws InterruptedException {
       webDriverWait.until(ExpectedConditions.elementToBeClickable(basePF.Betrag));
        basePF.putMoney();

    }

    @Then("I should using the payment method")
    public void I_should_using_the_payment_method() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(basePF.UberweisungBtn));
        basePF.UberweisungBtn.click();

    }

    @Then("I fill out the form donation data")
    public void I_fill_out_the_form_donation_data() {
        basePF.usePaymentMethod();
        basePF.scrollDown();

    }

    @Then("I click receive a donation receipt")
    public void I_click_receive_a_donation_receipt() {

        BrowserUtils.waitFor(3);
        BrowserUtils.waitForClickablility(basePF.recieveReceipt,3);
        basePF.recieveReceipt.click();
        basePF.setSelectCountry("Spanien");
    }

    @Then("I fill information could be deducted from the tax")
    public void I_fill_information_could_be_deducted_from_the_tax() {
        basePF.fillInformation();

    }

    @Then("I click submit donation button")
    public void I_click_submit_donation_button() throws InterruptedException {
        basePF.clickLargeButton();
        basePF.textWhite();
        basePF.clickWeiter();

    }

    @Given("I visited the Portal site")
    public void i_visited_the_Portal_site() {

        Driver.get().get(ConfigurationReader.getValue("url_fail"));
        BrowserUtils.waitFor(5);
        basePF.acceptCookies();
    }

    @When("I choose transfer")
    public void i_choose_transfer() {
        basePF.UberweisungBtn.click();
    }

    @Then("I fill the donation data")
    public void i_fill_the_donation_data() {
        basePF.getPaymentMethod();

    }

    @Then("I clicked submit donation button")
    public void i_clicked_submit_donation_button() throws InterruptedException {
        basePF.clickLargeButton();

    }

}
