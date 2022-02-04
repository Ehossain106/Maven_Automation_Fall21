package Hulu_POM;

import Reusable_Library.Reusable_annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HuluCreateAccount extends Reusable_annotations{
    ExtentTest logger;

    public HuluCreateAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_annotations.logger;

    }//end of constructor

    @FindBy(xpath ="//*[@id='email']")
    WebElement email;

    @FindBy(xpath ="//*[@id='password']")
    WebElement password;

    @FindBy(xpath ="//*[@id='firstName']")
    WebElement name;

    @FindBy(xpath ="//*[@class='field field__month']")
    WebElement Birthmonth;

    @FindBy(xpath ="//*[@class='field field__day']")
    WebElement BirthDay;

    @FindBy(xpath ="//*[@class='field field__year']")
    WebElement BirthYear;

    @FindBy(xpath ="//*[@class='field gender']")
    WebElement gender;

    @FindBy(xpath ="//button[contains(text(),'CONTINUE')]")
    WebElement continueButton;



}
