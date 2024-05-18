package pl.coderslab.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressPage {

    private final WebDriver driver;

    @FindBy(id = "field-alias")
    private WebElement aliasInput;

    @FindBy(id = "field-address1")
    private WebElement addressInput;

    @FindBy(id = "field-city")
    private WebElement cityInput;

    @FindBy(id = "field-postcode")
    private WebElement postalCodeInput;

    @FindBy(id = "field-id_country")
    private WebElement countryInput;

    @FindBy(id = "field-phone")
    private WebElement phoneNumberInput;

    @FindBy(className = "form-control-submit")
    private WebElement saveBtn;

    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterNewAddressData(String alias, String address, String city, String postalCode, String country, String phoneNumber) {
        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        postalCodeInput.sendKeys(postalCode);
        //countryInput.sendKeys(country);
        phoneNumberInput.sendKeys(phoneNumber);

        saveBtn.click();
    }
}