import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiHw {

    private final By FIRST_TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]");
//    private final By ARTICLE_TITLE = By.xpath(".//div[contains(@class, 'article-title')]");
    private final By ARTICLE_TITLE = By.xpath(".//h1[contains(@class, 'd-inline')]");


    @Test
    public void firstDelfiHomework() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");

        //Find first title element
//        WebElement firstTitle = driver.findElement(By.xpath(".//h1[contains(@class, 'headline__title')]"));
        WebElement firstTitle = driver.findElement(FIRST_TITLE);

        //Get and save this element text
        String firstTitleText = firstTitle.getText();

        //Click on this element
        firstTitle.click();

        // delay for slow internet
        Thread.sleep(10000);

        //Find article's title element
//        WebElement articleTitle = driver.findElement(By.xpath(".//h1[contains (@class, 'd-inline')]"));
        WebElement articleTitle = driver.findElement(ARTICLE_TITLE);

        //Get and save element's text
        String articleTitleText = articleTitle.getText();

        //Check
        Assertions.assertEquals(firstTitleText, articleTitleText);

    }
}
