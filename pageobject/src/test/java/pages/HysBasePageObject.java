package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HysBasePageObject extends PageObject {

    public void scrollDown(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(),5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDown(String scrollValue) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("scroll(0, " + scrollValue + ")");
    }

   }
