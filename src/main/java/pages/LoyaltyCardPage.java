package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoyaltyCardPage extends BasePage{
    @FindBy(xpath = "//div[@class ='col-lg-12 col-md-12 col-sm-12']")
    WebElement KarticaOpis;


    public LoyaltyCardPage(ChromeDriver driver) {
        super(driver);
    }

    public String getLoyaltyText() {
            return KarticaOpis.getText();
        }


}
