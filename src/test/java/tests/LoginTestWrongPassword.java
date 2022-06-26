package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

//ovaj test proverava da li se pojavljuje error message kao odgovor na pogresne pristupne podatke

public class LoginTestWrongPassword extends BaseTest {

    @Test
    public void LoginTestWrongPasswordTest() {
        ChromeDriver driver = new ChromeDriver();
        String WrongPasswordText ="Pogrešan Email ili Lozinka.";
        try {
            HomePage homePage = new HomePage(driver);
            homePage.clickAcceptInCookie();
            homePage.hoverPrijavaButton();
            homePage.setUsername("gisaopera@gmail.com");
            homePage.setPassword("stagod");
            homePage.clickLOGIN09();

            String actualWrongPasswordText = homePage.getWrongPasswordText();
            assert actualWrongPasswordText.contains(WrongPasswordText) : "Error! No wrong password error message." + WrongPasswordText + " . Actual: " + actualWrongPasswordText;
        } finally {
           driver.quit();
           print("Test confirms that login with wrong credentials gives the right error message.");
        }
    }

}
