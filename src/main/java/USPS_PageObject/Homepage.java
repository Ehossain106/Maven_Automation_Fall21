package USPS_PageObject;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Homepage extends Reusable_annotations {

    //constructor is a helper method allows you to identify objects in your POM
    //so later you can call those methods in your test class
    //because your pom class is not static
//declare local logger to your POM class
    ExtentTest logger;
    public Homepage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.logger = Reusable_annotations.logger;}


        @FindBy(xpath ="//li[contains(@class,'menuheader')]")
        List<WebElement> navigationTabsList;
        @FindBy(xpath = "//*[@id='mail-ship-width']")
        WebElement sendTab;

        //create a pom method to get the link count for the list
    public void getNavigationTabsCount(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try{
            wait.until(ExpectedConditions.visibilityOfAllElements(navigationTabsList));
            logger.log(LogStatus.PASS, "suceccessfully located the navigation tabs count " + navigationTabsList.size());

        }catch (Exception e) {
            logger.log(LogStatus.FAIL, "unable to get count from Navigation tab " + e);
        }//end of try and catch
        }//end of method
    public void clickOnSendTab(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,sendTab, logger, "send Tab");
    }//end of clicking on ship tab
}


