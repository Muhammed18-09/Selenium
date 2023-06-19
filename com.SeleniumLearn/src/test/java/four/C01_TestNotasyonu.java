package four;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_TestNotasyonu {

    @Test
    public void test01() {

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
       @Test
        public void test02() {
           WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
           driver.get("https://www.bestbuy.com");
           List<WebElement> butonBul = driver.findElements(By.tagName("button"));
           System.out.println(butonBul.size());
           for (WebElement each : butonBul) {
               System.out.println(each.getText());

           }
           driver.close();
       }
           @Test
          public void test03() {
               WebDriverManager.chromedriver().setup();
               WebDriver driver = new ChromeDriver();
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
               driver.get("https://www.amazon.com");
               WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
               aramaKutusu.sendKeys("Nutella");
               aramaKutusu.submit();
               WebElement sonucYazıElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
               System.out.println(sonucYazıElementi.getText());
               driver.close();
           }
    }





