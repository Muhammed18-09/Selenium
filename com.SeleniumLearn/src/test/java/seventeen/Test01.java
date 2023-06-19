package seventeen;

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

public class Test01 {

    @Test
    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/slider");

        Actions actions = new Actions(driver);
        WebElement slider = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));

        actions.dragAndDropBy(slider,50,0).build().perform();

        WebElement slidershow = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
        String slidershowConsulusion = slidershow.getAttribute("value");
        System.out.println("sonuç = "+ slidershowConsulusion );

        WebElement sliderPanelShow = driver.findElement(By.id("sliderValue"));
        String sliderPanelShowConuslusion = sliderPanelShow.getAttribute("value");
        System.out.println("sonuç = "+ sliderPanelShowConuslusion);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(slidershowConsulusion ,sliderPanelShowConuslusion,"Hata verdi");




    }
}
