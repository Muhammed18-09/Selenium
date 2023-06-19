package eleven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.security.Key;
import java.time.Duration;

public class Test01 {

    @Test
    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/");
        String urlAnaSayfa = "https://demoqa.com/";
        String actual = driver.getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        Actions actions = new Actions(driver);
        softAssert.assertEquals(actual,urlAnaSayfa,"Ana sayfa mı?");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        WebElement elelmentGit = driver.findElement(By.xpath("//*[text()='Elements']"));
        elelmentGit.click();
        WebElement elementDogrula = driver.findElement(By.xpath("//div[@class='main-header']"));
        softAssert.assertTrue(elementDogrula.isDisplayed());
        WebElement textBoxGit = driver.findElement(By.xpath("//*[text()='Text Box']"));
        textBoxGit.click();
        WebElement formIslem = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        actions.click(formIslem).sendKeys("Muhammed Şen").sendKeys(Keys.TAB).sendKeys("msen@gmail.com").sendKeys(Keys.TAB)
                .sendKeys("Barış Mah. Selcan Sokak No:10").sendKeys(Keys.TAB).sendKeys("Barış Mah. Selcan Sokak No:10")
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();



    }
}
