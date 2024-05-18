package pl.coderslab.shop;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddNewAddressSteps{

    WebDriver driver;
    MyAddressesPage myAddressesPage;

    @Given("There is a registered user and browser is opened on my store Log in to your account page")
       public void registeredUsed() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication");

    }

    @When("The user logs in")
    public void userLogsInToHisAccount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("fdcwhzswbqnfyfeddk@ckptr.com", "Franek2016");
        }
    @Then("User goes to the addresses page")
    public void user_goes_to_the_addresses_page() {
       YourAccountPage yourAccountPage = new YourAccountPage(driver);
       yourAccountPage.goToAddressesPage();
    }

    @When("^User adds new address: (.*), (.*), (.*), (.*), (.*),(.*)$")
    public void user_users_adds_new_address(String alias, String address, String city, String postalCode, String country, String phone) {
        myAddressesPage = new MyAddressesPage(driver);
        myAddressesPage.addNewAddress();
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.enterNewAddressData(alias, address, city, postalCode, country, phone);
    }

    @Then("The address is added to user's account")
    public void the_address_is_added_to_user_s_account() {
        Assertions.assertTrue(myAddressesPage.isSuccessAlertDisplayed(), "New address should be visible");
        String successMessage = myAddressesPage.getSuccessAlert();
        Assertions.assertEquals("Address successfully added!", successMessage);
    }
    @Then("The browser is closed")
    public void the_browser_is_closed() {
        driver.quit();
    }
}


