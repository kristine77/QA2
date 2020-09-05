import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstDelfiHw {
    @Test

    public void firstDelfiHomework() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");

        List<WebElement> titles = driver.findElements(By.xpath(".//h1[contains(@class, 'headline__title')]"));
        List<WebElement> comments = driver.findElements(By.xpath(".//a[contains(@class, 'comment-count')]"));

        for (int i = 0; i < titles.size(); i++) {
            System.out.println((i + 1) + ": " + titles.get(i).getText());
        }

        driver.findElement(By.xpath(".//h1[contains(@class, 'headline__title')]")).getText();
        String firstTitle = driver.findElement(By.xpath(".//h1[contains(@class, 'headline__title')]")).getText();

        driver.findElement(By.xpath(".//a[contains(@class, 'comment-count')]")).getText();
        String count = driver.findElement(By.xpath(".//a[contains(@class, 'comment-count')]")).getText();

        System.out.println(firstTitle + count);
    }
}
