package pages;

        import net.serenitybdd.screenplay.questions.JavaScript;
        import net.thucydides.core.annotations.Step;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

public class MainPage extends HysBasePageObject {

    @FindBy(xpath = "//*[@id=\"hs-eu-confirmation-button\"]")
    public  WebElement Accept;

    @FindBy(xpath = "//button[@data-target='#getReferenceModal']")
    public WebElement askForReferenceButton;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[1]/div/h2")
    public WebElement letsNetworkBlock;

    @FindBy(partialLinkText = "events")
    public WebElement seeMoreEventsButton;

    @FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")
    public WebElement seeMoreReferencesButton;

    @Step
    public void scrollToReferenceButton(){
        scrollDown("300");//300
    }

    @Step
    public void scrollToLetsNetworkBlock(){
        scrollDown(askForReferenceButton);

    }

    @Step
    public void clickOnSeeMoreEvents() {
        seeMoreEventsButton.click();
    }

}

