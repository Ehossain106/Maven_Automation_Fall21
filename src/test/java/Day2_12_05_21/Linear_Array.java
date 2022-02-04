package Day2_12_05_21;

public class Linear_Array {
    public static void main(String[] args) {

        //create a linear array for the cities
        //define the variables
        String[] cities, Zipcode;
        //define the linear array for the cities
        cities = new String[]{"brooklyn", "Manhattan", "Staten Island", "Queens", "Bronx"};
        Zipcode = new String[]{"11218", "11215", "10003", "11217", "33477"};

        //define the int variables
        int[] streetnumber;
        //define the linear array for the int
        streetnumber = new int[]{11, 22, 33, 44, 55};

        //print the first city and the first streetnumber
        System.out.println("My first city is " + cities[0] + " and my street number is " + streetnumber[0] + " and the zipcode is " + Zipcode[0]);
    }//end of main
}//end of class
