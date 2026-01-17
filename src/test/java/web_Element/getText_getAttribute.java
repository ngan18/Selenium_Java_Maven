package web_Element;

import Locators_CRM.LocatorsPageLogin;
import Locators_CRM.Locators_PageMenuCustomer;
import Locators_CRM.Locators_Page_CustomerSummary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class getText_getAttribute {

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

        driver.findElement(By.xpath(Locators_PageMenuCustomer.Customer)).click();
        System.out.println("Header customer: " + driver.findElement(By.xpath(Locators_Page_CustomerSummary.header)).getText());

        //getAttribute
        String GetAttribute = driver.findElement(By.xpath(LocatorsPageLogin.inputEmail)).getAttribute("value");
        System.out.println("GetAttribute: " + GetAttribute);

        String numerStarted = driver.findElement(By.xpath("//span[contains(text(), 'Not Started')]/preceding-sibling::span")).getText();
        System.out.println("numerStarted: " + numerStarted);

        driver.quit();
    }
}
