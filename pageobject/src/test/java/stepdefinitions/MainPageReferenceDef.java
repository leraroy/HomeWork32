package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.runner.RunWith;
import pages.MainPage;
import steps.SeeMoreReferencesSteps;
import steps.VacanciesPageSteps;



public class MainPageReferenceDef {

    @Steps
    SeeMoreReferencesSteps seeMoreReferencesSteps;

    @Given("^I access https://stage\\.hwr\\.hysdev\\.com/$")
    public void i_access_https_stage_hwr_hysdev_com() {
        seeMoreReferencesSteps.openMainPage();

    }

    @And("^I Scroll down to see ‘See all references’ button\\.$")
    public void i_Scroll_down_to_see_See_more_references_button() {
        System.out.println("Here we go!");

    }

    @When("^I click on ‘See all references’ button\\.$")
    public void i_click_on_See_more_references_button() throws Throwable {
        Thread.sleep(7000);
        seeMoreReferencesSteps.clickOnSeeMoreReferencesButton();

    }

        @Then("^references page is opened \\(https://stage\\.hwr\\.hysdev\\.com/references/\\)$")
    public void references_page_is_opened_https_stage_hwr_hysdev_com_references()  throws Throwable {
            Assert.assertTrue(seeMoreReferencesSteps.userShouldBeRedirected());
            //seeMoreReferencesSteps.userShouldBeRedirected();
    }



}
