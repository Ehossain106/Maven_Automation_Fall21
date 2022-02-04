package Day7_12_25_21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Mortgage_Select_Command {
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
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll to the desired page
        jse.executeScript("scroll(0,450)");

        //clear and type your new home value
        WebElement homeVal = driver.findElement(By.xpath("//*[contains(@name,'homevalue')]"));
        homeVal.clear(); //clear any pre-set values on the home value field
        homeVal.sendKeys("350000"); //enter my new data on the home value field

        //select my new start month let say November
        WebElement startMonth = driver.findElement(By.xpath("//*[contains(@name,'start_month')]"));
        /*select command can only be used when the drop down element is under 'Select' tag
        Select sMonthDropDown = new Select(startMonth);
        //select by visible text
        sMonthDropDown.selectByVisibleText("Nov");*/

        //if the dropdown tag is not under select then I need to click on the drop down and click on the value
        startMonth.click();
        //click on the value
        driver.findElement(By.xpath("//*[text()='Nov']")).click();



    }//end of main
    }//end of class

