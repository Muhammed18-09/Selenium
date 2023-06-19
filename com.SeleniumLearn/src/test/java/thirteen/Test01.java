package thirteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test01 {

    @Test
    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/broken");

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
       /* HttpResponse response = client.execute(request);
        int statuscode = response.getStatusLine().getStatusCode();
        System.out.println(statuscode);*/




    }
}
