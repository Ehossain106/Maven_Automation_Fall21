package Day8_12_26_21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class SwitchtoTabs_Examples {
    public static void main(String[] args) throws InterruptedException {
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
        driver.navigate().to("https://www.uhc.com/");
        Thread.sleep(2000);
        //click on find a doctor
        driver.findElement(By.xpath("//*[text()='Find a doctor']")).click();
        //scroll down to plan options
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement plan = driver.findElement(By.xpath("//*[@id='area-fad']"));
        jse.executeScript("arguments[0].scrollIntoView(true);", plan);
        //click on dropdown
        driver.findElement(By.xpath("//*[contains(text(),'Select your plan to sign in')]")).click();
        //click on the medicare plan value
        driver.findElement(By.xpath("//*[text()='Medicare plan']")).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        //driver.switchTo().window(tabs.get(0));
        //click on find a new plan on this new tab
        driver.findElement(By.xpath("//*[@id='alert-sticky__dismiss-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Sign In']")).click();


    }//end of main
}//end of class
