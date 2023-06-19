package nine;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test3 {

    WebDriver driver;

    @Test
    public void test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

    }
    @org.testng.annotations.Test(dependsOnMethods = "test1")
    public void test2(){
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@name='field-keywords']"));
        aramaKutusu.sendKeys("Nutella");
        WebElement sumbit = driver.findElement(By.xpath("//input[@type='submit']"));
        aramaKutusu.click();

    }

}

