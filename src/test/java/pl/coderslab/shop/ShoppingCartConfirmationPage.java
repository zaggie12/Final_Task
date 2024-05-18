package pl.coderslab.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartConfirmationPage {

    private static WebDriver driver;


    //@FindBy(className = "btn-primary")
    //private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//*[contains(text(),'Proceed to checkout')]")
   // "//*[text()='Tired']"
    private WebElement proceedToCheckoutButton;


    public ShoppingCartConfirmationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void proceedToCheckout() {
        proceedToCheckoutButton.click();
    }

}
