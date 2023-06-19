package thirteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test02 {
    WebDriver driver = new ChromeDriver();

@Test
    public void test1(){

    WebDriverManager.chromedriver().setup();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://demoqa.com/upload-download");

    WebElement download = driver.findElement(By.id("downloadButton"));
    download.click();

    }

    @Test (dependsOnMethods = "test1")
    public void  test2(){

        WebElement upload = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        upload.sendKeys("C:/Users/muhammed/Desktop/Muhammed Şen Cv.pdf");
        //upload.sendKeys("C:/Users/muhammed/Desktop/Muhammed Şen Cv.pdf");

    }
}
