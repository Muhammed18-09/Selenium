package twelve;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Test2 {

    @Test
    public void Test01(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/automation-practice-form");

        Actions actions = new Actions(driver);
        WebElement form = driver.findElement(By.xpath("//input[@id='firstName']"));
        actions.click(form).sendKeys("Muhammed").sendKeys(Keys.TAB).sendKeys("Şen").sendKeys(Keys.TAB)
                .sendKeys("msen@example.com").sendKeys(Keys.TAB).sendKeys("01234567890").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("test çalışması").sendKeys(Keys.TAB).click().sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("Altın Mah. Gezgin Sok. 27/6 İstanbul").sendKeys(Keys.TAB).click().click().sendKeys(Keys.TAB).click().click()
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    }
}
