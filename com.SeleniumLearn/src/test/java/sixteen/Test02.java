package sixteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test02 {

    @Test
    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/date-picker");

        WebElement calender = driver.findElement(By.id("datePickerMonthYearInput"));
        calender.click();

        WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
        Select select = new Select(month);
        select.selectByVisibleText("September");
        WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
        Select select1 = new Select(year);
        select1.selectByVisibleText("1999");

        List<WebElement> dayElements = driver.findElements(By.className("react-datepicker__day"));

        for (WebElement dayElement:dayElements) {

            String day = dayElement.getText();
            if(day.equals("18")){
                dayElement.click();
                break;
            }
        }


    }
}
