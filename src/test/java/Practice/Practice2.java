package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.rocketmortgage.com/calculators/mortgage-calculator");
        driver.findElement(By.xpath("//*[@id='purchasePrice']")).clear();
        driver.findElement(By.xpath("//*[@id='purchasePrice']")).sendKeys("500,000");
        driver.findElement(By.xpath("//*[@id='buttonPercent']")).click();
        driver.findElement(By.xpath("//*[@name='downPaymentPercent']")).clear();
        driver.findElement(By.xpath("//*[@name='downPaymentPercent']")).sendKeys("15");
        WebElement dropDownListBox = driver.findElement(By.xpath("//*[@name='term']"));
        Select clickThis = new Select(dropDownListBox);
        clickThis.selectByVisibleText("25 Years");
        driver.findElement(By.xpath("//*[@name='rate']")).clear();
        driver.findElement(By.xpath("//*[@name='rate']")).sendKeys("3.98");
        driver.findElement(By.xpath("//*[@name='zip']")).clear();
        driver.findElement(By.xpath("//*[@name='zip']")).sendKeys("11218");
        driver.findElements(By.xpath("//*[contains(@class,'phfc-u-mbl')]")).get(2).click();
        driver.findElement(By.xpath("//*[@id='calculateButton']")).submit();
        //driver.quit();

    }//end of main
}//end of class
