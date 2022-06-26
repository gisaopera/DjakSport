package tests;


import org.testng.annotations.Test;
import pages.HomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ProfilePage;

//ovaj test proverava da li je log-in uspesan sa ispravnim podacima

public class LoginTest extends BaseTest {

    @Test
    public void Logintest() {
        ChromeDriver driver = new ChromeDriver();
        String Name_User = "GLIGORIC PREDRAG";

        try {
            HomePage homePage = new HomePage(driver);
            homePage.clickAcceptInCookie();
            homePage.hoverPrijavaButton();
            homePage.setUsername("gisaopera@gmail.com");
            homePage.setPassword("slobodanmilosevicbarselona2019");
            homePage.waitForElement(homePage.loginButton);
            homePage.clickLOGIN09();


            ProfilePage profilePage = new ProfilePage(driver);
            String actualName_User = profilePage.getName_User();
            assert actualName_User.contains(Name_User) : "Error! No confirmed name of logged in user:"
                    + Name_User + " . Actual: " + actualName_User;

        } finally {
            driver.quit();
        }
        System.out.println("User logged in successfully");
    }
}
