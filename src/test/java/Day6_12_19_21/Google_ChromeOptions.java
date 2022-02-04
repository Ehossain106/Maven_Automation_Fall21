package Day6_12_19_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google_ChromeOptions {
    public static void main(String[] args) throws InterruptedException {
        //set the property for your webdriver/Chromedriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //declare and define the chromeoptions
        ChromeOptions options = new ChromeOptions();
        //declare the argument you need
        //maximize the driver
        options.addArguments("start-maximized");
        //set in incognito
        options.addArguments("incognito");
        //set as headless
        options.addArguments("headless");
        //define the webdriver you are using
        WebDriver driver = new ChromeDriver(options);

        //naviagte to google
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        System.out.println("Navigated to google");

        //enter keyword on google search
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

        System.out.println("Entered keyword on google search");


    }//end of main
}//end of class
