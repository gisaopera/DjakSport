package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LoyaltyCardPage;

// ovaj test proverava da li je tekst u Loyalty tabu ocekivan.

public class LoyaltyCardTest {
    @Test
    public void LoyaltyCardTest(){
        ChromeDriver driver = new ChromeDriver();
        try {
            HomePage homePage = new HomePage(driver);
            homePage.clickAcceptInCookie();
            homePage.clickAcceptInCookie2();
            homePage.clickLoyaltyTab();

            LoyaltyCardPage loyaltyCardPage = new LoyaltyCardPage(driver);
            String LoyaltyText = "Ukoliko ste u poslednjih 365 dana imali kupovinu u ukupnom iznosu od 40.000 dinara";
            String actualLoyaltyText = loyaltyCardPage.getLoyaltyText();
            assert actualLoyaltyText.contains(LoyaltyText) : "Error. Wrong text found. Expected: " + LoyaltyText + ". Actual: " + actualLoyaltyText;

        }finally {
                driver.quit();
        }
    }
}

