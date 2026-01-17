package dropDown_Radio_Checkbox;

import Locators_CRM.LocatorsPageLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class radio {
    public static void radio_check() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2 - Đi đến 1 url
        driver.get("https://demoqa.com/radio-button");
        // check radio

        boolean checkRadio1 = driver.findElement(By.xpath("//input[@id=\"yesRadio\"]")).isSelected();
        System.out.println("radio 1 : "+ checkRadio1);
        driver.findElement(By.xpath("//label[normalize-space()=\"Yes\"]")).click();

        boolean checkRadio2 = driver.findElement(By.xpath("//input[@id=\"yesRadio\"]")).isSelected();
        System.out.println("radio 1 : "+ checkRadio2);

        Thread.sleep(2000);

        driver.quit();
    }

    public static void radio2_check() throws InterruptedException {
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

        // check radio
        driver.findElement(By.xpath("//span[@class=\"menu-text\"][normalize-space()=\"Sales\"]")).click();
        driver.findElement(By.xpath("//span[normalize-space()=\"Proposals\"]")).click();
        driver.findElement(By.xpath("//a[normalize-space()=\"New Proposal\"]")).click();

        List<WebElement> Radio = driver.findElements(By.xpath("//span[normalize-space()=\"Show quantity as:\"]//following-sibling::div//input"));
        System.out.println("các radio: " + Radio.size());

        int check1 = 0;
        int check2= 0;
        for(int i=0; i<Radio.size();i++){
            if(Radio.get(i).isSelected()){
                System.out.println("radio is selected" + (i+1));
                check1++;
            } else {
                System.out.println("radio is not selected" +(i+1));
                check2++;
            }
        }
        System.out.println("total radio is selected: " + check1);
        System.out.println("total radio is not selected: "+ check2 );

        Thread.sleep(2000);

        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {

        //radio_check();

        radio2_check();
    }
}
