package USPS_PageObject;

import Reusable_Library.Reusable_annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_annotations {
    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);

    }//end of constructor method

    //create a static refrence for USPS homepage
    public static Homepage homepage(){
        Homepage homepage = new Homepage(driver);
        return homepage;
    }//end of homepage method

    //create a static refrence for USPS for send mail track pages
    public static SendMailAndTrack sendMailAndTrack(){
        SendMailAndTrack sendMailAndTrack = new SendMailAndTrack(driver);
        return sendMailAndTrack;
    }//end of homepage method

}
