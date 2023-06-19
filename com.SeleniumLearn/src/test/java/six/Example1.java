package six;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example1 {

@Test
    public void test1(){

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get("https://automationexercise.com");

    WebElement doğrulama = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
    Assert.assertTrue(doğrulama.isDisplayed());

    WebElement login = driver.findElement(By.xpath("//a[@href='/login']"));
    login.click();

    WebElement lonindogrula = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
    Assert.assertTrue(lonindogrula.isDisplayed());

    WebElement adSoyad = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
    adSoyad.sendKeys("Muhammed Şen");
    WebElement email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
    email.sendKeys("muhammedsnfu@gmail.com");
    WebElement kaydol = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
    kaydol.submit();
    driver.close();


    }


}
