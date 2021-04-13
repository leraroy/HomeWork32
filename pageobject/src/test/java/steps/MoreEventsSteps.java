package steps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import pages.MainPage;

public class MoreEventsSteps {

    @Managed
    MainPage moreEvents;



    @Step
    public void openMainPage() throws  Throwable{
        moreEvents.open();
    }

    @Step
    public void scrollDownToSeeLetsNetworkBlock(){
        moreEvents.scrollToLetsNetworkBlock();

    }

    @Step
    public  void  clickOnUpcomingEventsButton(){
        moreEvents.clickOnSeeMoreEvents();
    }

    @Step
    public boolean pageIsOpened() throws  Throwable{
        Thread.sleep(5000);
        return moreEvents.getDriver().getCurrentUrl().contains("https://stage.hwr.hysdev.com/events/");
    }
}
