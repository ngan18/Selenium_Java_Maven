package web_Element;

import Locators_CRM.LocatorsPageLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class handleCookie {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2 - Đi đến 1 url
        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath(LocatorsPageLogin.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsPageLogin.inputPassword)).sendKeys("123456");
        //driver.findElement(By.xpath(LocatorsPageLogin.buttonLogin)).click();

        driver.findElement(By.xpath(LocatorsPageLogin.inputPassword)).submit();

        Cookie addcookie = driver.manage().getCookieNamed("cookie");
        System.out.println(addcookie.getName());
        System.out.println(addcookie.getValue());

        driver.manage().addCookie(new Cookie(addcookie.getName(),addcookie.getValue()));

    }
}
