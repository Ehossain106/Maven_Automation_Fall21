package Day5_12_18_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AutomationLoop {
    public static void main(String[] args) throws InterruptedException {
        //set the array
        String[] Heros = new String [4];

        Heros [0] = "Spider-Man";
        Heros [1] = "Captain America";
        Heros [2] = "Hawkeye";
        Heros [3] = "Dr.Strange";

            //set the property of the chromedriver we are using
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            //define the web driver you are using
            WebDriver driver = new ChromeDriver();

            for(int i = 0; i < Heros.length; i++){
            //simply open the google web site
            //driver.navigate().to("https://www.google.com");

            //maximize my browser
            driver.manage().window().maximize(); //for windows

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);

            //searching for cars on google search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Heros[i]);

            //hit submit on google search button
            driver.findElement(By.xpath("//*[@value='Google Search']")).submit();

            //another wait statement since we came to a new page(results page)
            Thread.sleep(3000);

            //capture the results and store it as a variable
            String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //declaring the array variable to split the result
            String[] arrayResult = result.split(" ");
            //now print the search number only
            System.out.println("My search result is " + Heros[i] + " " + arrayResult[1]);
            //quit all caches
            //driver.quit();

        }//end of loop
    }//end of main
}//end of class
