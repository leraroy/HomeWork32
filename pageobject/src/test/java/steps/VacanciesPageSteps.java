package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import pages.VacanciesPage;

public class VacanciesPageSteps {

    VacanciesPage vacanciesPage;

    @Step
    public boolean isPageOpened(){

        return vacanciesPage.getDriver().getCurrentUrl().contains("career/vacancies/");
    }

    @Step
    public void clickOnFirstVacancyInList(){
        vacanciesPage.scrollDown("100");
        vacanciesPage.firsVacancyInList.click();
    }

    @Step
    public void enterName(String name){
        vacanciesPage.nameField.sendKeys(name);
    }

    @Step
    public void enterEmail(String email){
        vacanciesPage.emailField.sendKeys(email);
    }

    @Step
    public void enterPhone(String phone){
        vacanciesPage.phoneField.sendKeys(phone);
    }

    @Step
    public void clickOnPrivacyPolicyCheckbox(){
        vacanciesPage.checkBox.click();
    }

    @Step
    public void clickOnSubmitButton(){
        vacanciesPage.submitButton.click();
    }

    @Step
    public boolean isSuccessMessageDisplayed(){
        return true;
    }
}
