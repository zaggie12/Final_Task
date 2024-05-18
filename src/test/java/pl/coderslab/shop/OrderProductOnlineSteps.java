package pl.coderslab.shop;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class OrderProductOnlineSteps {


    WebDriver driver;
    HummingBirdSweaterPage hummingBirdSweaterPage;
    CheckoutPage checkoutPage;

    @Given("There is a registered user with address added and browser is open on my store Log in to your account page")
    public void registeredUsed() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication");
    }

    @When("The user logs into account")
    public void userLogsInToAccount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("fdcwhzswbqnfyfeddk@ckptr.com", "Franek2016");
    }
    @And("User goes to main page")
    public void userGoesToMainPAge() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.goToMainPage();
    }

    @And("User picks a Hummingbird Printed Sweater to buy")
    public void userPicksAHummingbirdPrintedSweaterToBuy() {
        MainPage mainPage = new MainPage(driver);
        mainPage.pickHummingbirdPrintedSweater();
    }

    @And("User chooses size {string}")
    public void userChoosesSizeM(String arg0) {
        hummingBirdSweaterPage = new HummingBirdSweaterPage(driver);
        hummingBirdSweaterPage.chooseSizeM();

    }

    @And("User picks {int} items of merchandise")
    public void userPicksQuantity(int arg0) {
        hummingBirdSweaterPage.selectQuantity();
    }

    @And("User adds product to Cart")
    public void userAddProductToCart() {
        hummingBirdSweaterPage.addToCart();
    }

    @And("User goes to checkout")
    public void userGoesToCheckout() {
        ShoppingCartConfirmationPage shoppingCartConfirmationPage = new ShoppingCartConfirmationPage(driver);
        shoppingCartConfirmationPage.proceedToCheckout();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.proceedToCheckout();
    }

    @And("User confirms delivery address")
    public void userConfirmsDeliveryAddress() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.confirmDeliveryAddress();
    }

    @And("User picks a {string} as a method of delivery")
    public void userPicksAAsAMethodOfDelivery(String arg0) {
        checkoutPage.confirmDeliveryOption();
    }

    @And("User picks a method of payment - {string}")
    public void userPicksAMethodOfPayment(String arg0) {
        checkoutPage.choosePaymentByCheck();
    }

    @And("User orders with an obligation to pay")
    public void userOrdersWithAnObligationToPay() {
    }

    @Then("Merchandise is ordered")
    public void merchandiseIsOrdered() throws IOException {
        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
        orderConfirmationPage.takeScreenShot();
    }

}
