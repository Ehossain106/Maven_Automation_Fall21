package Day8_12_26_21;

import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        /*array list is a resizable array, I don't define a length and can add
        more array variables
         */
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        System.out.println("My city is " + cities.get(2));

        ArrayList<Integer> zipcode = new ArrayList<>();
        zipcode.add(11218);
        zipcode.add(11215);
        zipcode.add(11217);
        System.out.println("My zipcode is " + zipcode.get(2));

        System.out.println("My city is " + cities.get(2) + " My zipcode is " + zipcode.get(2));
    }//end of main
}//end of class
