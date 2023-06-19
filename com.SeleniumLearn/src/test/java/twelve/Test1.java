package twelve;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Test1 {

    @Test
    public void tes01(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://demoqa.com/checkbox");
        Actions actions = new Actions(driver);
        SoftAssert softAssert = new SoftAssert();

        WebElement checkBox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        checkBox.click();
        checkBox.isSelected();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        driver.close();


    }
}
