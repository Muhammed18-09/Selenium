package fifteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test02 {

    @Test
    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame("frame1");
        WebElement frame = driver.findElement(By.xpath("//*[text()='Parent frame']"));
        String frametext = frame.getText();
        System.out.println(frametext);
        WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(frame2);
        WebElement frame2text = driver.findElement(By.xpath("//*[text()='Child Iframe']"));
        String  textFrame = frame2text.getText();
        System.out.println(textFrame);

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

        WebElement parentFrame = driver.findElement(By.id("framesWrapper"));
        String parentFrameText = parentFrame.getText();
        System.out.println(parentFrameText);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();

    }
}
