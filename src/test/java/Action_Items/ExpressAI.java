package Action_Items;

import Day9_01_08_22.Methods;
import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ExpressAI {
    //declare the webdriver outside the suit, so it can call for all methodsWebDriver driver;
    WebDriver driver;
    //your extentreport and extenttest command should be declared outside so it can be reusable among all annotations
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetTheDriver(){
        Reusable_Actions_Loggers Reusable_Actions;
        driver = Methods.setDriver();
        //set the path of the report once
        reports = new ExtentReports("src/main/java/HTML_Report/Express.Report.html",true);
    }//end of precondition

    @Test
    public void ExpressShop() throws InterruptedException, BiffException, IOException, WriteException {
        //Step 1: read the data from the Excel sheet you created
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/expressResults.xls"));
        //Step 2: locating the worksheet that you created for the workbook
        Sheet readableSheet = readableFile.getSheet(0);
        //will return the physical row sheet
        int rowCount = readableSheet.getRows();
        System.out.println("My row count is " + rowCount);

        //Step 3: create a writable file to mimic readable, but you can also write back the results to this file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/expressResults.xls"),readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is " + rowCount2);

        logger = reports.startTest("Purchase Item at Express");
        driver.navigate().to("https://www.express.com/");

        //verify Express title appears as expected
        String actualTitle = driver.getTitle();
        //by using if else to compare expected with actual title
        if (actualTitle.equals("Express - Men's & Women's Clothing")) {
            System.out.println("Title matches " + actualTitle);
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }

        //hover to the quick tool tab
        Reusable_Actions_Loggers.mouseHover(driver, "//*[text()='Women']", logger, "Women");

        //click on "dresses" link // use contains Href
        Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Dresses']", logger, "dresses");

        //wait a few seconds and scroll down 400-500 pixel)
        Thread.sleep(2000);
        Reusable_Actions_Loggers.scrollingByPixel(driver, "0", "750");
        Reusable_Actions_Loggers.clickbyIndex(driver,"//*[@class='_2fbIe3xmE78JEQRb26pdpQ']", 1, logger, "clicked dress");
        Thread.sleep(2000);

        Reusable_Actions_Loggers.clickMethod(driver, "//span[contains(text(),'XS')]",logger, "size");
        Reusable_Actions_Loggers.clickMethod(driver, "//button[contains(text(),'Add to Bag')]",logger, "Add to bag");
        Reusable_Actions_Loggers.clickMethod(driver, "//*[@class='btn _37UdwV18 XnTsKiDr _20VnLhFF']",logger, "view bag");
        Thread.sleep(2000);

        Reusable_Actions_Loggers.clickMethod(driver, "//*[@id='continue-to-checkout']", logger, "checkout");
        Reusable_Actions_Loggers.clickMethod(driver, "//button[contains(text(),'Checkout as Guest')]",logger, "Add to bag");


        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='firstname']","Enjam", logger,"name");
        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='lastname']","Hossain", logger,"name");
        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='email']","enjamhossain1@gmail.com", logger,"email");
        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='confirmEmail']","enjamhossain1@gmail.com", logger,"email");
        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='phone']","7184150619", logger,"number");
        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.line1']","530 Mcdonald Ave", logger,"address");
        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.postalCode']","11218", logger,"zip");
        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.city']","Brooklyn", logger,"city");
        Reusable_Actions_Loggers.selectMethod(driver, "//*[@name='shipping.state']","NY", logger,"state");
        Reusable_Actions_Loggers.clickMethod(driver, "//button[contains(text(),'Continue')]",logger, "continue");
        Reusable_Actions_Loggers.clickMethod(driver, "//button[contains(text(),'Continue')]",logger, "continue");
        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='creditCardNumber']","11218", logger,"zip");
        Reusable_Actions_Loggers.selectMethod(driver, "//*[@name='expMonth']","10", logger,"CC M");
        Reusable_Actions_Loggers.selectMethod(driver, "//*[@name='expYear']","24", logger,"CC Y");
        Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='cvv']","423", logger,"CVV");
        Reusable_Actions_Loggers.clickMethod(driver, "//button[contains(text(),'Place Order')]",logger, "place Order");
        String ccError = Reusable_Actions_Loggers.getTextMethod(driver, "//*[@id='rvn-note-NaN']", "Error Message");
        System.out.println("My Total due is " + ccError);
        driver.manage().deleteAllCookies();











        //click on second image

        //Step 6: writing back to the writable file to see
        writableFile.write();
        writableFile.close();


        //end the logger
        reports.endTest(logger);
    }

        @AfterSuite
        public void endTest(){
            driver.quit();
            //write/log the information back to the html report
            reports.flush();
        }//end of after suite
    }

