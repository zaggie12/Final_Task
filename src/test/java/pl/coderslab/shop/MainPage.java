package pl.coderslab.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private static WebDriver driver;



    @FindBy(xpath = "//a[normalize-space()='Hummingbird printed sweater']")
    private WebElement hummingBirdSweaterButton;

    @FindBy(className = "alert-success")
    private WebElement successAlert;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void pickHummingbirdPrintedSweater() {
        hummingBirdSweaterButton.click();
    }

    public boolean isSuccessAlertDisplayed() {
        return successAlert.isDisplayed();
    }

    public String getSuccessAlert() {
        return successAlert.getText();
    }

}