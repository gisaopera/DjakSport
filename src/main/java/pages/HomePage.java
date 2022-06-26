package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//li[@id ='ctl06_ctl01_menu_ctl02_megaItem']")
    WebElement sportoviDropDownMenu;

    @FindBy(xpath = "//a[@href ='https://www.djaksport.com/default.aspx?nodeid=601&p=69679']")
    WebElement kosarkaDres;

    @FindBy(xpath = "//a[@id ='ctl06_ctl02_RepeaterRaster_ctl03_aRaster']")
    WebElement LargeDres;

    @FindBy(xpath = "//a[@class ='btn fullWidth add-to-cart']")
    WebElement DodajUKorpu;

    public HomePage(ChromeDriver driver){
        super(driver);
        driver.get("https://www.djaksport.com/");
        print("Smiley");
    }

    public void hoverSportoviDropDownMenu() {
        hoverOverElement();
    }

    public void hoverPrijavaButton() {
        hoverOverElement();
    }
}

