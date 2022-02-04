package Action_Items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Website_Java_Automation {
    public static void main(String[] args) throws InterruptedException, IOException {
        //kill all chrome instances that are opened
        //Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        String[] Gyms = new String[6];
        Gyms[0] = "Blink Gym";
        Gyms[1] = "Equinox Gym";
        Gyms[2] = "TMPL Fitness";
        Gyms[3] = "Retro Fitness Gym";
        Gyms[4] = "Planet Fitness";
        Gyms[5] = "Gold's Gym";
        //set your path for your driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //create your options and add your arguments
        ChromeOptions options = new ChromeOptions();
        //set your arguments
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //options.addArguments("headless");
        //create your driver
        WebDriver driver = new ChromeDriver(options);
        //create your loop to iterate through your dynamic array
        for (int i = 0; i < Gyms.length; i++) {
            //go to bing.com
            driver.navigate().to("https://www.bing.com/");
            //put a few seconds to wait
            Thread.sleep(2000);
            //enter the array variable set in the search bar
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Gyms[i]);
            //click the search button
            driver.findElement(By.xpath("//*[@id='search_icon']")).submit();
            //wait a few seconds
            Thread.sleep(3000);
            //create variable for the search results
            String result = driver.findElements(By.xpath("//*[contains(@class,'sb_count')]")).get(0).getText();
            //split the array to capture results
            String[] arrayResult = result.split(" ");
            //split and print out the search result only for each value
            //on print statement mention which value you are printing as well as their search number
            System.out.println("The search results for "+ Gyms[i] + " is " + arrayResult[0]);
        }//end of loop
        //outside the loop, quit the driver
        driver.quit();
    }//end of main
}//end of class
