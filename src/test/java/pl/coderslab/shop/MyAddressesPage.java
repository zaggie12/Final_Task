package pl.coderslab.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressesPage {
    private static WebDriver driver;



    @FindBy(xpath = "//span[normalize-space()='Create new address']")
    private WebElement addNewAddressButton;

    @FindBy(className = "alert-success")
    private WebElement successAlert;


    public MyAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void addNewAddress() {
        addNewAddressButton.click();
    }

    public boolean isSuccessAlertDisplayed() {
        return successAlert.isDisplayed();
    }

        public String getSuccessAlert() {
            return successAlert.getText();
        }

}