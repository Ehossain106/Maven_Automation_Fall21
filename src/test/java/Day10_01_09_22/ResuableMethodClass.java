package Day10_01_09_22;

import Day9_01_08_22.Methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ResuableMethodClass {
    //declare the webdriver outside the annotation methods, so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Methods.setDriver();
    }//end of precondition

    @Test
    public void googleSearchLoop(){
        ArrayList<String > cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");

        for(int i = 0; i < cars.size(); i++){
            //navigating to google
            driver.navigate().to("https://www.google.com");
            //entering a unique keyword from array list
            Methods.sendKeysMethod(driver,"//*[@name='q']",cars.get(i),"Search Field");
            }
    }//end of test
    @AfterSuite
    public void endSession(){
        driver.quit();
    }

}
