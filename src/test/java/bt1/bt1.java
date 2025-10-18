package bt1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class bt1 {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub


        WebDriver driver = new ChromeDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2 - Đi đến 1 url

        driver.navigate().to("https://rise.anhtester.com/signin");

        //3 - Lấy Title và in ra console

        System.out.println(driver.getTitle());



        // Thoát hẳn Browser

        driver.findElement(By.name("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.className("btn-lg")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
