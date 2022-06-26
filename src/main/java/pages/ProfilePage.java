package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    @FindBy(xpath = "//span[@id ='ctl06_ctl14_lblPrijava']")
    WebElement Name_User;



    public ProfilePage(ChromeDriver driver) {
        super(driver);
    }

    public String getName_User() {
        return Name_User.getText();
    }
}
