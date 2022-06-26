package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemPage;
import pages.SearchResultPage;
import pages.BasePage;


public class SearchTest extends BaseTest{

    // Search test trazi "Dres Plavi" i potvrdjuje da postoji specifican artikal TS PEAK DRES M KSS1901 SRB PLAVI kao rezultat pretrage
    @Test
    public void chooseSportoviDropDownMenu(){
        ChromeDriver driver = openChromeDriver();
        String itemName = "TS PEAK DRES M KSS1901 SRB PLAVI";
        try {
            HomePage homePage = new HomePage(driver);
            homePage.clickAcceptInCookie();
            homePage.clickAcceptInCookie2();
            homePage.searchForItem("DRES PLAVI");
            SearchResultPage searchResultPage= new SearchResultPage(driver);
            searchResultPage.clickOnItemInList(itemName);

            ItemPage itemPage = new ItemPage(driver);
            String actualItemName = itemPage.getItemName();
         assert actualItemName.contains(itemName) : "Error. Wrong item name. Expected: " + itemName + ". Actual: " + actualItemName;

        }finally {
            //          driver.quit();
        }
    }
}
