package eighteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test01 {

    @Test
    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/tool-tips");

        WebElement toolTipsButton = driver.findElement(By.id("toolTipButton"));
        Actions actions = new Actions(driver);
        actions.moveToElement(toolTipsButton).perform();

        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));

        WebElement tooltip = driver.findElement(By.className("tooltip-inner"));
        System.out.println("Text: "+ tooltip.getText());

    }
}
