package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPageReferencePopUp  extends HysBasePageObject {


    @FindBy(id = "full_name")
    public WebElement referenceFormNameTextField;

    @FindBy(id = "email")
    public WebElement referenceFormEmaileTextField;

    @FindBy(xpath = "//*[@id=\"reference-form\"]/div[2]/div/div[1]/label/label")
    public WebElement termsAndAgreementsCheckBox;

    @FindBy(xpath = "//button[@id='ref-inquiry-submit-btn']")
    public WebElement referenceFormSubmitButton;

    public void scrollDownToReferenceFormSubmitButton(){
        Actions builder = new Actions(getDriver());
        Action mouseOverHome = builder
                .moveToElement(referenceFormNameTextField).click().sendKeys(Keys.PAGE_DOWN)
                .build();

        mouseOverHome.perform();
        scrollDown("300");
    }
}
