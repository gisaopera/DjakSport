package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchResultPage extends BasePage {

    public SearchResultPage(ChromeDriver driver) {
        super(driver);
        print("Search result page");
    }

    public void clickOnItemInList(String itemName) {
        List<WebElement> items = driver.findElements(By.xpath("//h4[@class = 'productName']"));
        for(WebElement item : items) {
            String currentItemName = item.findElement(By.xpath("//h4[@class = 'productName']")).getText();
            if (currentItemName.contains(itemName)) {
                scrollToElement(item);
                item.click();
                break;
            }
        }
    }

    private void scrollToElement(WebElement item) {
    }


}
