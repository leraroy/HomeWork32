package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.MainPageSteps;
import steps.MoreEventsSteps;

public class MoreEventsStepDef {

    @Steps
    MoreEventsSteps moreEventsSteps;


    @Given("^I go main page Hys Site$")
    public void iGoMainPageHysSite() throws Throwable{
        moreEventsSteps.openMainPage();
    }
    @And("^I Scroll down to see ‘Let’s network’ block$")
    public void iScrollDownToSeeLetSNetworkBlock() {
        moreEventsSteps.scrollDownToSeeLetsNetworkBlock();
    }

    @When("^I click on ‘Upcoming events’ button$")
    public void i_click_on_Upcoming_events_button() {
        moreEventsSteps.clickOnUpcomingEventsButton();
    }

    @Then("^Page \"([^\"]*)\" is opened$")
    public void page_is_opened(String arg1) throws Throwable{
    Assert.assertTrue(moreEventsSteps.pageIsOpened());
}

}
