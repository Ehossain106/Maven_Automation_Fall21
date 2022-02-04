package Day4_12_12_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Automation {
    public static void main(String[] args) {

        //set the property of the chrome driver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //define the WebDriver you are using
        WebDriver driver = new ChromeDriver();

        //Open the Google website
        driver.navigate().to("https://www.google.com");

        //Maximize my browser
        driver.manage().window().maximize();//full for windows

        //close the window
        driver.close();

    }//end of main
}//end of class
