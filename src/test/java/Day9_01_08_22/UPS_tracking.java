package Day9_01_08_22;

import org.openqa.selenium.WebDriver;

public class UPS_tracking {

    public static void main(String[] args) {
         WebDriver driver = Methods.setDriver();
        //navigate to ups
        driver.navigate().to("https://www.ups.com/us");
        //click on track
        Methods.clickMethod(driver,"//*[text()='Tracking']","Track");
        //click on track a package
        Methods.clickMethod(driver,"//*[text()='Track a Package']","Track a Package");
        //enter any tracking number
        Methods.sendKeysMethod(driver,"//*[@id='stApp_trackingNumber']","1111111111111","Enter Tracking");
      //capture the error message and print out only 'We could not locate the shipment'
        String resultValue = Methods.getTextMethod(driver,"//*[@id='stApp_error_alert_list0']","Error Message");
        //declare array and split
    String[] arrayResult = resultValue.split("details");
    System.out.println("My error info is " + arrayResult[0]);

}//end of main method
}//end of class

