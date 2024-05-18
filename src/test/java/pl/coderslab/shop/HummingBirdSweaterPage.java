package pl.coderslab.shop;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HummingBirdSweaterPage {


    private static WebDriver driver;


    //@FindBy(id = "group_1")
    //private List<WebElement> sizeDropdownMenu;

    @FindBy(className = "touchspin-up")
    private WebElement quantityUpButton;

    @FindBy(id="quantity_wanted")
    private WebElement enterQuantityInput;

    @FindBy(className = "add-to-cart")
    private WebElement addToCartButton;


    public HummingBirdSweaterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseSizeM() {
        Select dropdown = new Select(driver.findElement(By.id("group_1")));
        dropdown.selectByVisibleText("M");
    }

    public void selectQuantity() {
        //for (int i = 0; i < 5; i++) {
        //    quantityUpButton.click();
        enterQuantityInput.sendKeys(Keys.chord(Keys.CONTROL, "a"), "5");
        ((JavascriptExecutor)driver).executeScript("window.stop();");
        }

    public void addToCart() {
            //addToCartButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
        }

}
