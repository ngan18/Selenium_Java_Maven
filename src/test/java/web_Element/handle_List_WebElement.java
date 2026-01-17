package web_Element;

import Locators_CRM.LocatorsPageLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class handle_List_WebElement {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2 - Đi đến 1 url
        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath(LocatorsPageLogin.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsPageLogin.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsPageLogin.buttonLogin)).click();

        //get all list web_element
        List<WebElement> ListMenu = driver.findElements(By.xpath("//ul[@id=\"side-menu\"]/li[contains(@class, \"menu-item\")]"));
        System.out.println(ListMenu.size());
        for (int i =0; i<ListMenu.size(); i++){
            System.out.println("List menu: " + ListMenu.get(i).getText());
        }

        System.out.println(ListMenu.get(1).getText().contains("Dashboard"));
    }

}
