package Day2_12_05_21;

public class DynamicArray {
    public static void main(String[] args) {
        //create a string dynamic array for countries
        String[] countries = new String[5];// set the boundaries for your array
        //how you define your values by the varibles indexing
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "bangladesh";
        countries[3] = "India";
        countries[4] = "Pakistan";

        //integer dynamic array
        int[] houseNumber = new int[5];
        //define values for your variable (houseNumber)
        houseNumber [0] = 111;
        houseNumber [1] = 222;
        houseNumber [2] = 333;
        houseNumber [3] = 444;
        houseNumber [4] = 555;

        System.out.println("My Favorite country is " + countries[0] + " with the house number as " + houseNumber[0]);


    }//end of main
}//end of class
