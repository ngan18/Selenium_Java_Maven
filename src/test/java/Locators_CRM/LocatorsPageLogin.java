package Locators_CRM;

import java.util.List;

public class LocatorsPageLogin {
    public static String url = "https://crm.anhtester.com/admin/authentication";

    public static String headerLogin = "//h1[normalize-space()=\"Login\"]";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Sign in']";

    public static String forgetPassword = "//a[normalize-space()='Forgot password?']";
    public static String checkbox = "//input[@id=\"remember\"]";
    public static String labelCheckbox = "//label[normalize-space()=\"Remember me\"]";

    public static String alertErrorMessage = "";
    public static String alertErrorMessageEmailRequire = "//span[@id='email-error']";
    public static String alertErrorMessagePasswordRequire = "//span[@id='password-error']";

    //lấy chung cho all các error giống nhau
    public static String errorMess = "//div//p[contains(@class,'text-danger')]";


    public static void verify(){
        String[] alerMessage1 = {"The Email", "The Password",""};

        List<String> alertMessage2 = List.of("The Email", "The Password","");

        for (String message : alertMessage2){
            System.out.println("alert message: " + message);
            String alerErrorMessageItems = "//div[ = '"+ message + "']";

            //diver.findElement....
        }
    }

//    public static void main(String[] args) {
//        verify();
//    }
}
