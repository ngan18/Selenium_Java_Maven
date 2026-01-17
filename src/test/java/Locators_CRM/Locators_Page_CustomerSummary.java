package Locators_CRM;

public class Locators_Page_CustomerSummary {
    public static String header = "//span[normalize-space()=\"Customers Summary\"]";
    public static String SearchHeader = "//div[@id='top_search']//input[@id='search_input']";
    public static String btn_QuickCreate = "//div[@id=\"top_search\"]//following::li[@data-original-title='Quick Create']";
    public static String btn_NewCustomer = "//a[normalize-space()=\"New Customer\"]";
    public static String btn_ImportCustomer = "//a[normalize-space()=\"Import Customers\"]";
    public static String btn_Contacts = "//a[normalize-space()='Contacts' and contains(@href, 'all_contacts')]";

    public static String label_TotalCustomers ="//span[normalize-space()=\"Total Customers\"]";
    public static String label_ActiveContacts = "//span[normalize-space()=\"Active Contacts\"]";

    public static String Btn_Search = "//div[@id=\"clients_filter\"]//input[@type=\"search\"]";

    public static String firstRow_item = "//tbody/tr[1]/td[3]";

}

