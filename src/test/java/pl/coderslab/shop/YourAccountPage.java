package pl.coderslab.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage {
    private static WebDriver driver;



    @FindBy(xpath = "//a[@title='Addresses']")
    private WebElement addressesButton;

    @FindBy(id = "_desktop_logo")
    private WebElement goToMainPageButton;



    public YourAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void goToAddressesPage() {
        addressesButton.click();
    }

    public void goToMainPage()
    {
        goToMainPageButton.click();
    }


}