package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FilterPage extends BasePage {

    @FindBy(xpath = "//ul/li[@id=\"ctl06_ctl02_RepeaterSize_Shoes_ctl33_sizeLi\"]")
    WebElement velicina37;

    @FindBy(xpath = "//li/a[@class='crvena']")
    WebElement bojaCrvena;

    @FindBy(xpath = "//div/a[@title='Ukloni veličinu 37']")
    WebElement velicina37Tag;

    @FindBy(xpath = "//div/a[@title='Ukloni NovaKolekcija']")
    WebElement NovaKolekcijaTag;

    @FindBy(xpath = "//div/a[@id = 'ctl06_ctl02_breadCrumb_ctl01_link']")
    WebElement bojaCrvenaTag;



    public FilterPage(ChromeDriver driver) {
        super(driver);
    }

    public void clickVelicina37() {
        velicina37.click();
    }

    public void clickBojaCrvena() {
        bojaCrvena.click();
    }

    public String getNovaKolekcijaTag() {
        return NovaKolekcijaTag.getText();
    }
    public String getvelicina37Tag() {
        return velicina37Tag.getText();
    }
    public String bojaCrvenaTag() {
        return bojaCrvenaTag.getText();
    }

    public void scrollToBoja() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);" ,bojaCrvena);
    }

    public void scrollToVelicina() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);" ,velicina37);
    }
}
