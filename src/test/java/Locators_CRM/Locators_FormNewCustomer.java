package Locators_CRM;

public class Locators_FormNewCustomer {
    public static String header_CustomerDetails = "//a[normalize-space()=\"Customer Details\"]";

    public static String Company = "//input[@id=\"company\"]";
    public static String VATNumber = "//input[@id=\"vat\"]";
    public static String Phone = "//input[@id=\"phonenumber\"]";
    public static String Website = "//input[@id=\"website\"]";
    public static String Group = "//button[@data-id='groups_in[]']";
    public static String inputGroup = "//button[@data-id='groups_in[]']//following-sibling::div//input[@type='search']";
    public static String Currency = "//button[@data-id='default_currency']";
    public static String inputCurrency = "//button[@data-id='default_currency']//following-sibling::div//input[@type='search']";
    public static String DefaultLanguage = "//button[@data-id='default_language']";
    public static String Address = "//button[@data-id='default_language']";
    public static String City = "//input[@id=\"city\"]";
    public static String State = "//input[@id=\"state\"]";
    public static String Zip = "//input[@id=\"zip\"]";
    public static String Country = "//button[@data-id='country']";
    public static String inputCountry = "//button[@data-id='country']//following-sibling::div//input[@type='search']";

    public static String btn_SaveAndCreateContact = "//button[normalize-space()=\"Save and create contact\"]";
    public static String btn_Save = "//div[@id=\"profile-save-section\"]//button[normalize-space()='Save']";



}
