package Day9_01_08_22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {
    public static void main(String[] args) throws InterruptedException {
        //set up your driver
        WebDriverManager.chromedriver().setup();
        //set up your options
        ChromeOptions options = new ChromeOptions();
        //set your arguments
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        //navigate to USPS.com
        driver.navigate().to("https://www.USPS.com");
        Thread.sleep(2000);

        //set your mouseActions
        Actions mouseActions = new Actions(driver);

        //verify the welcome page title appears as expected
        String actualTitle = driver.getTitle();
        //by using if else to compare expected with actual title
        if(actualTitle.equals("Welcome | USPS")){
            System.out.println("Title matches " + actualTitle);
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }


        //hover over send tab using mouse action
        try{
            //declare your variable for the element you want to hover
            WebElement sendTab = driver.findElement(By.xpath("//*[text()='Send']"));
            //use mouse actions to hover
            mouseActions.moveToElement(sendTab).perform();
        }catch (Exception e) {
            System.out.println("unable to hover over send tab");
        }//end of try and catch

        //click on zip code
        try{
            //declare your variable
            WebElement zipcodeLookup = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            //use mouse action to click
            mouseActions.moveToElement(zipcodeLookup).click().perform();
        }catch (Exception e){
            System.out.println("Unable to click on zip code");
        }//end of try and catch

    }//end of main
}//end of class
