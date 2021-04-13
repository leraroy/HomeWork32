package steps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class SeeMoreReferencesSteps {

    @Managed
    MainPage seeMoreReferences;
    MainPage mainPage;

    @Step
    public void openMainPage() {
        mainPage.open();
    }

    @Step
    public void clickOnSeeMoreReferencesButton() {
        seeMoreReferences.scrollDown("2400");
        seeMoreReferences.seeMoreReferencesButton.click();
    }

    @Step
    public boolean userShouldBeRedirected() throws Throwable {
        Thread.sleep(7000);
        return seeMoreReferences.getDriver().getCurrentUrl().contains("https://stage.hwr.hysdev.com/references/");

    }
}
