package Pratice_AddCustomer;

import Locators_CRM.LocatorsPageLogin;
import Locators_CRM.Locators_FormNewCustomer;
import Locators_CRM.Locators_PageMenuCustomer;
import Locators_CRM.Locators_Page_CustomerSummary;
import common.BaseTest;
import org.openqa.selenium.By;

public class Add_Customer extends BaseTest {
    public static void LoginCRRM(){

        driver.get(LocatorsPageLogin.url);
        driver.findElement(By.xpath(LocatorsPageLogin.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsPageLogin.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsPageLogin.buttonLogin)).click();


    }
    public static void open_NewCustomer_Page(){
        driver.findElement(By.xpath(Locators_PageMenuCustomer.Customer)).click();
        driver.findElement(By.xpath(Locators_Page_CustomerSummary.btn_NewCustomer)).click();

    }
    public static void Add_newCustomer(String customer){

        driver.findElement(By.xpath(Locators_FormNewCustomer.Company)).sendKeys(customer);


        //lấy xpath language
        String language_Xpath = String.format(Locators_FormNewCustomer.option_Language, "Germany");
        System.out.println("language xpath: " + language_Xpath);
        driver.findElement(By.xpath(language_Xpath)).click();

    }

    public static void searchCustomer(String customer) throws InterruptedException {

        driver.findElement(By.xpath(Locators_PageMenuCustomer.Customer)).click();
        driver.findElement(By.xpath(Locators_Page_CustomerSummary.Btn_Search)).clear();
        driver.findElement(By.xpath(Locators_Page_CustomerSummary.Btn_Search)).sendKeys(customer);

        Thread.sleep(2000);

        String firstRowCustomer = driver.findElement(By.xpath(Locators_Page_CustomerSummary.firstRow_item)).getText();
        System.out.println("first row customer :  " + firstRowCustomer);


    }
    public static void main(String[] args) throws InterruptedException {

        Create_Driver();

        LoginCRRM();
        open_NewCustomer_Page();
        Add_newCustomer("company one");

        searchCustomer("company one");
        Close_Driver();

    }
}
