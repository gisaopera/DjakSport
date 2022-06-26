package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.LoyaltyCardPage;

// ovaj test proverava da li je tekst u Loyalty tabu u redu - iznos kupovine mora biti 40.000 dinara.

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
            String LoyaltyText = "SAKUPLJAJTE I TROŠITE POENE BILO KADA U NAREDNIH GODINU DANA - 1 POEN = 1 DINAR";
            String actualLoyaltyText = loyaltyCardPage.getLoyaltyText();
            assert actualLoyaltyText.contains(LoyaltyText) : "Error. Wrong text found. Expected: " + LoyaltyText + ". Actual: " + actualLoyaltyText;

        }finally {
                driver.quit();
        }
    }
}

