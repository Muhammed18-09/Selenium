package second;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodları {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //url getirir
        driver.get("https://www.trendyol.com");

        //sayfa başlığı
        System.out.println("sayfa balışı:"+ driver.getTitle());

        //içinde olduğu sayfanın url döndürür
        System.out.println(driver.getCurrentUrl());

        //içinde olduğu sayfanın kaynak kodlarını döndürür
        System.out.println("===============================");
        System.out.println(driver.getPageSource());
        System.out.println("================================");

        //içinde oluduğu sayfanın UNIQUE hash kodunu döndürür
        System.out.println(driver.getWindowHandle());

        //açılan tüm sayfalın UNIQUE hash kodlarını döndürür
        //System.out.println(driver.getWindowHandles());




    }
}
