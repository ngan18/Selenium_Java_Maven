package dropDown_Radio_Checkbox;

import Locators_CRM.LocatorsPageLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.By.*;

public class check_box {

    public static void Handle_checkbox() {
        WebDriver driver = new ChromeDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2 - Đi đến 1 url
        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(xpath(LocatorsPageLogin.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(xpath(LocatorsPageLogin.inputPassword)).sendKeys("123456");
        //driver.findElement(By.xpath(LocatorsPageLogin.buttonLogin)).click();

        driver.findElement(By.xpath(LocatorsPageLogin.inputPassword)).submit();
// check box
        driver.findElement(By.xpath("//div[normalize-space()='Dashboard Options']"));

        List<WebElement> checkboxes = driver.findElements(xpath("//div[@class='checkbox']//input[@type='checkbox']"));
        System.out.println("tổng số checkbox: " + checkboxes );

        for (int i = 0; i< checkboxes.size(); i++)
            if (checkboxes.get(i).isSelected()) {
                System.out.println("check box is selected");
            } else {
                System.out.println("check box is not selected ");
                checkboxes.get(i).click();
                System.out.println("check box is now selected");
            }
    }
    public static void main(String[] args) {
        Handle_checkbox();

    }
}
