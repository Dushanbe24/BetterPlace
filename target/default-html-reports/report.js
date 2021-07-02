$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DonationForm.feature");
formatter.feature({
  "name": "Donation form for visit and payment method",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "visit and prepare a donation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@betterP"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I visited donation Portal site",
  "keyword": "Given "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.I_visited_donation_Portal_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should prepare a donation of money",
  "keyword": "When "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.I_should_prepare_a_donation_of_money()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should using the payment method",
  "keyword": "Then "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.I_should_using_the_payment_method()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill out the form donation data",
  "keyword": "And "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.I_fill_out_the_form_donation_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click receive a donation receipt",
  "keyword": "And "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.I_click_receive_a_donation_receipt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill information could be deducted from the tax",
  "keyword": "Then "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.I_fill_information_could_be_deducted_from_the_tax()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click submit donation button",
  "keyword": "Then "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.I_click_submit_donation_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "the test should be fail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@betterP"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I visited the Portal site",
  "keyword": "Given "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.i_visited_the_Portal_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose transfer",
  "keyword": "When "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.i_choose_transfer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the donation data",
  "keyword": "Then "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.i_fill_the_donation_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked submit donation button",
  "keyword": "Then "
});
formatter.match({
  "location": "org.betterplace.step_defs.DonationFormStepDefs.i_clicked_submit_donation_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});