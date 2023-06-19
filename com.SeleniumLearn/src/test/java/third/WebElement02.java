package third;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement02 {
    //facebook gidin
    //cookies çıkarsa kabul ete bassın
    //e-posta kutusuna rastgele mail gir
    //şifre kısmına rastgele şifre gir
    //giriş yap butonuna bas
    //uyarı versin
    //mesaj çıktısını test et
    //sayfayı kapat

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");
        WebElement elementmailDene = driver.findElement(By.id("email"));
        elementmailDene.sendKeys("jdshbclksdjcb");
        WebElement elementSifreDene = driver.findElement(By.id("pass"));
        elementSifreDene.sendKeys("dcs98whnfın9pw");
        WebElement girisYap = driver.findElement(By.xpath("//button[@name='login']"));
        girisYap.submit();

        driver.close();


    }
}
