package dropDown_Radio_Checkbox;

import common.BaseTest;
import org.openqa.selenium.By;

public class dropdown_dynamic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        Create_Driver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(1000);

        //Click vào dropdown
        driver.findElement(By.xpath("//span[normalize-space()=\"Select a Category\"]")).click();
        Thread.sleep(3000);

        //Search giá trị cần chọn
        driver.findElement(By.xpath("//span[normalize-space()=\"Select a Category\"]/parent::a/following-sibling::div//input")).sendKeys("Travel");

        Thread.sleep(2000);

        //Click chọn Text đã search
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click();

        // cách 2: dùng enter chỉ hiển thị duy nhất 1 giá trị khi tìm được
        //Actions action = new Actions(driver);
        //action.sendKeys(Keys.ENTER).perform();

        Close_Driver();
    }
}
