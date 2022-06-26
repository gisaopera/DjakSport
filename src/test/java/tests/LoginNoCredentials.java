package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.BasePage;

//ovaj test proverava da li se pojavljuje error message kao odgovor na ne upisivanje podataka

public class LoginNoCredentials extends BaseTest {
    @Test
    public void LoginNoCredentials() {
        ChromeDriver driver = new ChromeDriver();
        String ObavezanEmailText = "Email je obavezno polje";
        String ObaveznaLozinkaText = "Lozinka je obavezno polje";
        try {
            HomePage homePage = new HomePage(driver);
            homePage.clickAcceptInCookie();
            homePage.hoverPrijavaButton();
            homePage.clickLogin();

            String actualObavezanEmailText = homePage.getObavezanEmail();
            assert actualObavezanEmailText.contains(ObavezanEmailText) :
                    "Error! No error message for empty Email field:" +
                            ObavezanEmailText + " . Actual: " + actualObavezanEmailText;
            String actualObaveznaLozinkaText = homePage.getObaveznaLozinka();
            assert actualObaveznaLozinkaText.contains(ObaveznaLozinkaText) :
                    "Error! No error message for empty Password field:" +
                            ObaveznaLozinkaText + " . Actual: " + actualObaveznaLozinkaText;
        } finally {
            driver.quit();
            print("Test confirms that login with no added credentials gives the right error messages.");
        }
    }
}

