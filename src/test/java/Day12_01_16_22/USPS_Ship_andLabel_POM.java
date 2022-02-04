package Day12_01_16_22;

import Reusable_Library.Reusable_annotations;
import USPS_PageObject.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import org.jsoup.Connection;
import org.testng.annotations.Test;

public class USPS_Ship_andLabel_POM extends Reusable_annotations {

    @Test
    public void USPS_Verfiy_Tabs_then_ship_A_Label(){
        //navigate to usps.
        logger.log(LogStatus.INFO, "Navigating to USPS home page");
        driver.navigate().to("https://www.usps.com");

        //verify the tabs count
        BaseClass.homepage().getNavigationTabsCount();

        //click on send tab
        BaseClass.homepage().clickOnSendTab();

        //click on ship a label
        BaseClass.sendMailAndTrack().clickOnPrintLabelButton();
    }
}
