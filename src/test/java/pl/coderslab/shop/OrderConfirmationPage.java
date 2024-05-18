package pl.coderslab.shop;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class OrderConfirmationPage {

        private static WebDriver driver;

        public OrderConfirmationPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void takeScreenShot() throws IOException {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Kamil Parzych\\Desktop\\Programming\\CODER'S LAB KURS\\Zadania Zaliczeniowe\\screenshot.png"));
        }


}


