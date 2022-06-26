package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    ChromeDriver driver = null;

    @FindBy(xpath = "//ul/li/a[@href='NovaKolekcija']")
    WebElement NovaKolekcijaTab;

    @FindBy (xpath = "//input[@name = 'ctl06$ctl07$txtName']")
    WebElement searchField;

    @FindBy (xpath = "//i[@class ='fa fa-search']")
    WebElement searchButton;

    @FindBy (xpath = "//i[@class ='fa fa-user']")
    WebElement prijavaButton;

    @FindBy (xpath = "//a[@id ='ctl06_ctl03_DjakCookiesPanel1_btnAgree']")
    WebElement cookieAcceptButton;

    @FindBy (xpath = "//button[@id ='onesignal-slidedown-allow-button']")
    WebElement cookieAcceptButton2;

    @FindBy (xpath = "//input[@name ='ctl06$ctl14$txtLoginEmail']")
    WebElement emailButton;

    @FindBy (xpath = "//input[@name ='ctl06$ctl14$txtLoginPassword']")
    WebElement passwordButton;

    @FindBy (xpath = "//input[@name ='ctl06$ctl14$btnLogin']")
    public
    WebElement loginButton;

    @FindBy(xpath = "//div/div/ul/li[contains(.,\"Email je obavezno polje\")]")
    WebElement ObavezanEmail;

    @FindBy(xpath = "//div/div/ul/li[contains(.,\"Lozinka je obavezno polje\")]")
    WebElement ObaveznaLozinka;

    @FindBy(xpath = "//label[@for ='ctl06_ctl14_txtLoginEmail']")
    WebElement WrongPasswordText;

    @FindBy(xpath = "//a[@href ='loyalty']")
    WebElement LoyaltyTab;

    public BasePage(ChromeDriver driver){
        PageFactory.initElements(driver, this);
        print("Testiranje Djak sport");
        this.driver = driver;
    }
    // metoda za klik u Filter testu na tab Novo
    public void NovaKolekcijaTabClick() {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.elementToBeClickable(NovaKolekcijaTab));
        NovaKolekcijaTab.click();
    }
    public void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));    }

    public void clickAcceptInCookie() {
        waitForElement(cookieAcceptButton);
        cookieAcceptButton.click();
    }

    public void clickAcceptInCookie2() {
        waitForElement(cookieAcceptButton2);
        cookieAcceptButton2.click();
    }

    public void hoverOverElement(){
        Actions actions = new Actions(driver);
        actions.moveToElement(prijavaButton).perform();
    }

    public void clickOnElement(Object novoField){
      Actions actions = new Actions(driver);
      actions.click().perform();
     }

    public void enterTextIntoSearchField(String text) {
        searchField.sendKeys(text);
    }
    public void clickSearchButton() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }

    public void searchForItem(String text) {
        enterTextIntoSearchField(text);
        clickSearchButton();
    }



    public void clickLoyaltyTab() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(LoyaltyTab));
        LoyaltyTab.click();
    }

    public void setUsername(String usernametext){
        emailButton.sendKeys(usernametext);
    }
    public void setPassword(String passwordtext) {
        passwordButton.sendKeys(passwordtext);
    }
    public void clickLogin(){
       loginButton.click();
   }
    public void clickLOGIN09 (){
        loginButton.click();
    }


    public String getObavezanEmail() {
        return ObavezanEmail.getText();
    }
    public String getObaveznaLozinka() {
        return ObaveznaLozinka.getText();
    }
    public String getWrongPasswordText() {
        return WrongPasswordText.getText();
    }

    public static void print(String s) {
        System.out.println(s);}


}
