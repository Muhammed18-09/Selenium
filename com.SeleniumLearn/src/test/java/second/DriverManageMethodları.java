package second;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodları {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.trendyol.com");

        //içerisinde olduğumuz sayfanın ölçüğlerüninn döndürür
        System.out.println(driver.manage().window().getSize());
        //içinde oldupu sayfanın pozisyonunu verir
        System.out.println(driver.manage().window().getPosition());

        driver.manage().window().setPosition(new Point(15,15));
        //sayfayı bizim yazacağımız ölcülüere getirir
        driver.manage().window().setSize(new Dimension(123,12));
        System.out.println("yeni pencere ölçüleri:"+driver.manage().window().getSize());
        System.out.println("yeni pencere konumu:"+ driver.manage().window().getPosition());

        driver.manage().window().maximize();
        System.out.println( driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().minimize();

        driver.manage().window().fullscreen();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.trendyol.com");

    }

}
