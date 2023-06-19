package five;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ifelseassertion {

    @Test
    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        WebElement sonucGor = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String yazi = sonucGor.getText();
        driver.close();

        String arananKelime = "Kutella";

        Assert.assertFalse(yazi.contains(arananKelime));

    }

}
