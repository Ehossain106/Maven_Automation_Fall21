package Action_Items;

import Day9_01_08_22.Methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class action_item_Hulu{
    //declare the webdriver outside the suit, so it can call for all methods
    WebDriver driver;

    @BeforeSuite
    public void setDriver(){driver = Methods.setDriver();} //end of precondition

    @Test
    public void GotoHulu() {
        //set your arrays for your sendkeys
        //array for email
        ArrayList<String> email = new ArrayList<>();
        email.add("Enjamhossain49@gmail.com");
        email.add("Pablo.escobar48@icloud.com");
        //array for password
        ArrayList<String> password = new ArrayList<>();
        password.add("Eh205447725!");
        password.add("Majne205447725!");
        //array for name
        ArrayList<String> name = new ArrayList<>();
        name.add("Enjam Hossain");
        name.add("Pablo Escobar");
        //array for month
        ArrayList<String> month = new ArrayList<>();
        month.add("October");
        month.add("December");
        //array for day
        ArrayList<String> day = new ArrayList<>();
        day.add("1");
        day.add("6");
        //array for year
        ArrayList<String> year = new ArrayList<>();
        year.add("1999");
        year.add("1998");
        //array for gender
        ArrayList<String> gender = new ArrayList<>();
        gender.add("Male");
        gender.add("Male");
        //set your loop
        for (int i = 0; i < email.size(); i++) {
            //navigate to HULU
            driver.navigate().to("https://www.hulu.com/welcome");
            //use reusable class to scroll
            Methods.scrollingByPixel(driver, "0", "2000");
            //use reusable class to select "most popular option"
            Methods.clickMethod(driver, "//button[contains(text(),'SELECT')]", "Hulu button");
            //use reusable class to type email in
            Methods.sendKeysMethod(driver, "//*[@id='email']", email.get(i), "email");
            //use reusable class to type password in
            Methods.sendKeysMethod(driver, "//*[@id='password']", password.get(i), "password");
            //use reusable class to type your name in
            Methods.sendKeysMethod(driver, "//*[@id='firstName']", name.get(i), "name");
            //use reusable class to type your birth month
            Methods.clickMethod(driver, "//*[@class='field field__month']", "Birthdate");
            //use reusable class to pass your array as the values of birth month
            Methods.clickMethod(driver, "//*[text()='" + month.get(i) + "']", "month");
            //use reusable class to type your birth day
            Methods.clickMethod(driver, "//*[@class='field field__day']", "Day");
            //use reusable class to
            Methods.clickMethod(driver, "//*[text()='" + day.get(i) + "']", "day");
            //use reusable class to type your birth year
            Methods.clickMethod(driver, "//*[@class='field field__year']", "Year");

            Methods.clickMethod(driver, "//*[text()='" + year.get(i) + "']", "year");
            //use reusable class to type your gender
            Methods.clickMethod(driver, "//*[@class='field gender']", "Gender");

            Methods.clickMethod(driver, "//*[text()='" + gender.get(i) + "']", "gender");
            //use reusable class to click on continue button
            Methods.clickMethod(driver, "//button[contains(text(),'CONTINUE')]", "Sign Up Button");
            ////use reusable class to capture and store value
            String totalDue = Methods.getTextMethod(driver, "//*[@class='summary__price']", "Due Today");
            //print out total due
            System.out.println("My Total due is " + totalDue);
            //clear your cookies at the end of your loop
            driver.manage().deleteAllCookies();
                   }//end of loop

    }//end of test 1
    @Test (dependsOnMethods = "GotoHulu")
    public void VerifyHulu() {
        //navigate to hulu home page
        driver.navigate().to("https://www.hulu.com/welcome");
        //Using reusable method, click on login button
        Methods.clickMethod(driver, "//button[contains(text(),'Log In')]", "Log in");
        //Using reusable method, clear and type your email
        Methods.sendKeysMethod(driver, "//*[@id='email_id']", "Enjamhossain49@gmail.com", "email");
        //Using reusable method, clear and type your password
        Methods.sendKeysMethod(driver, "//*[@id='password_id']", "Eh205447725!", "password");
        //Using reusable method, click button to log in
        Methods.clickMethod(driver,"//*[text() = 'LOG IN']","logging in");
        //Using reusable method, get text and store as a string
        String userName = Methods.getTextMethod(driver, "//*[text()='Enjam Hossain']", "Username");
        //print and verify login successful
        System.out.println("My username is " + userName);
    }//end of test 2

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }


}
