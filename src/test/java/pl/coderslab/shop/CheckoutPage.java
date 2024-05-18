package pl.coderslab.shop;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckoutPage {


    private static WebDriver driver;


    @FindBy(name = "id_address_delivery")
    private WebElement addressConfirmationRadioButton;


    @FindBy(xpath = "//button[@name='confirm-addresses']")
    private WebElement addressesConfirmationButton;

    @FindBy(name = "confirmDeliveryOption")
    private WebElement shoppingConfirmationButton;

    @FindBy(id = "payment-option-1")
    private WebElement payByCheckButton;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement conditionsApprovalButton;

    @FindBy(xpath = "//*[contains(text(),'Place order')]")
    private WebElement placeOrderButton;



    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void confirmDeliveryAddress() {
        //addressConfirmationRadioButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addressesConfirmationButton));
        button.click();
        ;
    }

    public void confirmDeliveryOption() {
        //addressConfirmationRadioButton.click();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,1000)");
        //WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
        //WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addressesConfirmationButton));
        //button.click();
        shoppingConfirmationButton.click();
    }

    public void choosePaymentByCheck() {

       conditionsApprovalButton.click();
        payByCheckButton.click();
        placeOrderButton.click();

        //JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,1000)");
       //WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
       // WebElement button = wait.until(ExpectedConditions.elementToBeClickable(conditionsApprovalButton));
       // button.click();

    }
}


