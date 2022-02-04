package Day8_12_26_21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mlcalc_TryCatchExample {
    public static void main(String[] args) {
        //call the webdriver manager
        WebDriverManager.chromedriver().setup();
        //call to chrome option
        ChromeOptions options = new ChromeOptions();
        //set your arguments
        //options.addArguments("incognito");
        options.addArguments("start-maximized");
        //options.addArguments("headless");
        //set your driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to UHC website
        driver.navigate().to("https://www.mlcalc.com/");

        //enter value for purchase price
        try{
            WebElement pPrice = driver.findElement(By.xpath("//*[@id='ma'"));
            pPrice.clear();
            pPrice.sendKeys("400000");
        }catch (Exception e){
            System.out.println("unable to type value on purchase price " + e);
        }//end of purchase price exception

        //enter value for purchase price
        try{
            driver.findElement(By.xpath("//*[text()='Show Advanced options']")).click();
        }catch (Exception e){
            System.out.println("unable to click value Show Advanced options " + e);
        }//end of purchase price exception
    }//end of main
}//end of class
