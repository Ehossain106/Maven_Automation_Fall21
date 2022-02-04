package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class WeightWatchers {
    public static void main(String[] args) throws InterruptedException {
//set your driver
        WebDriverManager.chromedriver().setup();
// set your chromeoptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //options.addArguments("headless");
//set your driver
        WebDriver driver = new ChromeDriver(options);
//set your Array
        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11218");
        zipcode.add("11215");
        zipcode.add("11217");
//set your loop
        for (int i = 0; i < zipcode.size(); i++) {
//navigate to weightwatchers.com
            driver.navigate().to("https://www.weightwatchers.com/us/");
            Thread.sleep(1000);
//try and catch the attend button
            try {
                driver.findElement(By.xpath("//*[text()='Attend']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on attend" + e);
            }
            Thread.sleep(1000);
//try and catch the pop-up
            try {
                driver.findElement(By.xpath("//*[@class='No Thanks']")).click();
            } catch (Exception e) {
                System.out.println("no pop up detected");
            }

            Thread.sleep(1000);
            //try and catch the workshops button
            try {
                driver.findElement(By.xpath("//*[@class='MenuItem_subtitle__3LoiE']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click workshops " + e);
            }

//try and catch the studio button
            try {
                driver.findElement(By.xpath("//*[text()='Studio']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on Studio" + e);
            }

//try and catch the zipcode string array
            try {
                driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(zipcode.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter Zipcode" + e);
            }
//try and catch the submit button
            try {
                driver.findElement(By.xpath("//*[@type='submit']")).click();
            } catch (Exception e) {
                System.out.println("unable to click submit" + e);
            }
            Thread.sleep(2000);
//try and catch the links button
            try {
                List<WebElement> links = driver.findElements(By.xpath("//*[@class='linkUnderline-1_h4g']"));
                if (i == 0) {
                    links.get(i).click();
                    Thread.sleep(2000);
                }if (i == 1) {
                    links.get(i).click();
                    Thread.sleep(2000);
                }if (i == 2) {
                        links.get(i).click();
                        Thread.sleep(2000);
                }//end of if statement
            }catch(Exception e) {
                System.out.println("Unable to store and click variables" + e);
            }

//try and catch the address
            try {
                String address = driver.findElement(By.xpath("//*[contains(@class,'address-2PZwW')]")).getText();
                System.out.println("My Address is " + address);
            } catch (Exception e) {
                System.out.println("unable to get address" + e);
            }
//try and catch the scrolling action
            try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                WebElement VirtualShop = driver.findElement(By.xpath("//*[contains(text(),'Virtual Workshops schedule')]"));
                jse.executeScript("arguments[0].scrollIntoView(true);", VirtualShop);
                VirtualShop.getText();

                //try and catch the schedule printing
                try {
                    String schedule = driver.findElement(By.xpath("//*[contains(@class,'scheduleContainerMobile-1RfmF')]")).getText();
                    System.out.println("the " + VirtualShop + " is " + schedule);
                } catch (Exception e) {
                    System.out.println("unable to print hours and times" + e);
                }
            } catch (Exception e) {
                System.out.println("unable to scroll " + e);

            }//end of catch
            }//end of loop
    }//end of main
}//end of class

