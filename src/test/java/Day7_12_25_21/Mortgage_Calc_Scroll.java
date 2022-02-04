package Day7_12_25_21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mortgage_Calc_Scroll {
    public static void main(String[] args) throws InterruptedException {
        //set up your chromedriver
        WebDriverManager.chromedriver().setup();
        // set up your options and set your arguments
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //set up your driver with options
        WebDriver driver = new ChromeDriver(options);
        //navigate to the mortgage calculator website
        driver.navigate().to("https://www.mortgagecalculator.org");
        //set wait time to load page
        Thread.sleep(2000);
        //scroll to the windows loan view
        //set your javascript command for scrolling
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll to the desired page
        jse.executeScript("scroll(0,450)");
    }//end of main
}//end of class
