package second;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodları {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.trendyol.com");
        //istenen url gider
        driver.navigate().to("https://www.hepsiburada.com");
        //bir önceki sayfaya gider
        driver.navigate().back();
        //ileri gitmeye yarar
        driver.navigate().forward();
        //sayfayı yenileyecek
        driver.navigate().refresh();
        //driver oluştrulduğunda açılan sayfayı kapatmaya yarar
        driver.close();
        //birden fazla tab veya pencere varsa kapatır
        driver.quit();



    }
    }

