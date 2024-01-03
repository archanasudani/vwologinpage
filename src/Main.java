import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
       // driver.manage().window().minimize();
        driver.findElement(By.id("login-username")).sendKeys("archana");
        driver.findElement(By.id("login-password")).sendKeys("abc123");
        driver.findElement(By.id("js-login-btn")).click();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
       // driver.manage().timeouts().implicitlyWait(Duration.parse("1"));
        //Thread.sleep(300);
        try {
            // Sleep for 1000 milliseconds (1 second)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Handle any potential interruption exception
            e.printStackTrace();
        }
        driver.findElement(By.id("login-username")).clear();
        driver.findElement(By.id("login-password")).clear();
        driver.quit();
        System.out.println("Browser opening was successful");
       // driver.wait(200000);
    }
}