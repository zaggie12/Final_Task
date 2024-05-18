package pl.coderslab.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {


        private static WebDriver driver;


        @FindBy(xpath = "//*[contains(text(),'Proceed to checkout')]")
        // "//*[text()='Tired']"
        private WebElement proceedToCheckoutButton;


        public ShoppingCartPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }


        public void proceedToCheckout() {
            proceedToCheckoutButton.click();
        }

    }
