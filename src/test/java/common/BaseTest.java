package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    //khai báo driver
    public static WebDriver driver;

    public static void Create_Driver(){
        driver = new ChromeDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Create driver");

    }

    public static void Close_Driver(){

        if(driver!=null){
            driver.quit();
            System.out.println("closed driver");
        }

    }
}
