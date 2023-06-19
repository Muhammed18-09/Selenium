package ten;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.time.Duration;
import java.util.List;

public class Test01 {
    /*1. Tarayıcıyı başlatın
      2. 'http://automationexercise.com' URL'sine gidin
      3. Ana sayfanın başarıyla göründüğünü doğrulayın
      4.'Ürünler' düğmesine tıklayın
      5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla yönlendirildiğini doğrulayın
      6. Ürün listesi görünür
      7. İlk ürünün 'Ürünü Görüntüle'ye tıklayın
      8. Kullanıcı ürün detay sayfasına yönlendirildi
      9. Ürün adı, kategorisi, fiyatı, bulunabilirliği, durumu, markası gibi ayrıntıların göründüğünü doğrulayın.*/

    @Test
    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationexercise.com");
        Actions actions = new Actions(driver);
        SoftAssert softAssert = new SoftAssert();
        String expectedUrl = "http://automationexercise.com";
        String actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"ama sayfayı dene");
        WebElement product = driver.findElement(By.xpath("//a[@href='/products']"));
        product.click();
        WebElement productDogrula = driver.findElement(By.xpath("//img[@src='/static/images/shop/sale.jpg']"));
        softAssert.assertTrue(productDogrula.isDisplayed(),"product sayfası deneme");
        List<WebElement> productList = driver.findElements(By.xpath("//*[text()='View Product']"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(productList.size()>0,"ürünleri gör dene");
        WebElement urun = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
        urun.click();
        WebElement detayDogrula = driver.findElement(By.xpath("//*[text()='Blue Top']"));
        softAssert.assertTrue(detayDogrula.isDisplayed());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();





    }

}
