package third;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElement03 {
    //https://www.bestbuy.com git
    //cokies çıkarsa kabul et
    //sayfada kaç adet buton olduğunu bul
    //sayfadaki her bir buton üzerindeki yazıları yazdır

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com");
        int say = 0;
        List<WebElement> butonBul = driver.findElements(By.tagName("button"));
        System.out.println(butonBul.size());
        for (WebElement each:butonBul) {
            System.out.println(each.getText());
            
        }


    }
}
