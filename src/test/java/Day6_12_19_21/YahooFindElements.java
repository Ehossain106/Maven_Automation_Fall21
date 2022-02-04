package Day6_12_19_21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YahooFindElements {
    public static void main(String[] args) throws InterruptedException {
        //set the property of the webdriver
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        // set your chromeOptions
        ChromeOptions options = new ChromeOptions();
        // set your arguments
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //options.addArguments("headless");
        // set your web-driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to yahoo.
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2000);
        //click on the news link in yahoo
        driver.findElements(By.xpath("//*[contains(@class,'_yb_1rhax')]")).get(1).click();
    }//end of main
}//end of class
