package Hulu_POM;

import Reusable_Library.Reusable_annotations;
import USPS_PageObject.Homepage;
import USPS_PageObject.SendMailAndTrack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HuluBaseClass extends Reusable_annotations {

    public HuluBaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);

    }//end of constructor method

    //create a static reference for USPS homepage
    public static HuluHomepage Huluhomepage() {
        HuluHomepage Huluhomepage = new HuluHomepage(driver);
        return Huluhomepage;
    }//end of homepage method




}
