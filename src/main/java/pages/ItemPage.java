package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

    @FindBy(xpath = "//span[@id = 'ctl06_ctl02_lblProductName']")
    WebElement itemName;


    public ItemPage(ChromeDriver driver) {
        super(driver);
    }

    public String getItemName() {
        return itemName.getText();
    }


}
