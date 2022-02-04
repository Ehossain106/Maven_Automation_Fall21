package Hulu_POM;

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

public class HuluHomepage extends Reusable_annotations {
    //constructor is a helper method allows you to identify objects in your POM
    //so later you can call those methods in your test class
    //because your pom class is not static
//declare local logger to your POM class
    ExtentTest logger;

    public HuluHomepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_annotations.logger;
    }

    @FindBy(xpath ="//button[contains(text(),'SELECT')]")
    WebElement select_Button;

    public void clickOnSelectButton(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,select_Button,logger,"select Button");

    }//end of method
    }

