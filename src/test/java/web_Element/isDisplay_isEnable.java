package web_Element;

import Locators_CRM.LocatorsPageLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class isDisplay_isEnable {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        boolean checkHeaderLogin = driver.findElement(By.xpath(LocatorsPageLogin.headerLogin)).isDisplayed();

        System.out.println("checkHeaderLogin: " + checkHeaderLogin);
        Thread.sleep(2000);

        boolean checkBtnLogin = driver.findElement(By.xpath(LocatorsPageLogin.buttonLogin)).isDisplayed();
        System.out.println("checkBtnLogin: " + checkBtnLogin);

        driver.findElement(By.xpath(LocatorsPageLogin.checkbox)).click();

        boolean checkbox_RememberMe = driver.findElement(By.xpath(LocatorsPageLogin.checkbox)).isSelected();
        System.out.println("checkbox_RememberMe: " + checkbox_RememberMe);



        driver.quit();
    }
}
