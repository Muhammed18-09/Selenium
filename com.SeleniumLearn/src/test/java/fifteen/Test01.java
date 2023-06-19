package fifteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test01 {

    @Test
    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/frames");

        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));

        driver.switchTo().frame(frame);

        WebElement text = driver.findElement(By.id("sampleHeading"));
       String frameText = text.getText();
        System.out.println(frameText);

        driver.switchTo().parentFrame();
        WebElement parent = driver.findElement(By.id("framesWrapper"));
        String parentText = parent.getText();
        System.out.println(parentText);



    }
}
