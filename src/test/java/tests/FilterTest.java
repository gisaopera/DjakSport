package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.FilterPage;
import pages.BasePage;



public class FilterTest extends BaseTest {
    @Test
    public void FilterTest () {

        String NovaKolekcijaTag = "NOVAKOLEKCIJA";
        String velicina37Tag = "37";
        String bojaCrvenaTag = "CRVENA";

        ChromeDriver driver = new ChromeDriver();
        try {
            HomePage homePage = new HomePage(driver);
            homePage.clickAcceptInCookie();
            homePage.NovaKolekcijaTabClick();

            FilterPage filterPage = new FilterPage(driver);
            WebDriverWait wait = new WebDriverWait(driver, 10);

            filterPage.scrollToVelicina();
            filterPage.clickVelicina37();
            print("Selektovana velicina obuce");
            filterPage.scrollToBoja();
            filterPage.clickBojaCrvena();
            print("Selektovana boja obuce");


            String actualNovaKolekcijaTag = filterPage.getNovaKolekcijaTag();
            String actualvelicina37Tag = filterPage.getvelicina37Tag();
            String actualbojaCrvenaTag = filterPage.bojaCrvenaTag();

            assert actualNovaKolekcijaTag.contains(NovaKolekcijaTag) :
                    "Error! No error message for empty Password field:" +
                            NovaKolekcijaTag + " . Actual: " + actualNovaKolekcijaTag;
            assert actualvelicina37Tag.contains(velicina37Tag) :
                    "Error! No error message for empty Password field:" +
                            velicina37Tag + " . Actual: " + actualvelicina37Tag;
            assert actualbojaCrvenaTag.contains(bojaCrvenaTag) :
                    "Error! No error message for empty Password field:" +
                            bojaCrvenaTag + " . Actual: " + actualbojaCrvenaTag;



        } finally {
            driver.quit();
        }
    }
}
