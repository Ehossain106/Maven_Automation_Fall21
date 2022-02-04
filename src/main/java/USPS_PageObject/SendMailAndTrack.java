package USPS_PageObject;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMailAndTrack extends Reusable_annotations {

    //constructor is a helper method allows you to identify objects in your POM
    //later you can call those methods in your test class
    //because your pom class is not static
    //declare local logger to your POM class
    ExtentTest logger;
    public SendMailAndTrack(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.logger = Reusable_annotations.logger;}

    @FindBy(xpath = "//*[text()='Print a Label']")
    WebElement PrintLabelButton;

    //click on print label button
    public void clickOnPrintLabelButton(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,PrintLabelButton,logger,"print label button");

    }//end of method


}