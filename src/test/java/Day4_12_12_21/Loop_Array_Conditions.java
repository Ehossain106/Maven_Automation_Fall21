package Day4_12_12_21;

public class Loop_Array_Conditions {
    public static void main(String[] args) {
        //create a dynamic array for 4 cities, iterate through the value but only print when city is
        //either brooklyn or queens

        String[] cities = new String[4];
        cities [0] = "Brooklyn";
        cities [1] = "Bronx";
        cities [2] = "Queens";
        cities [3] = "Manhattan";

        for(int i = 0; i < cities.length; i++){
            //two if conditions
            if(cities[i] == "Brooklyn"){
                System.out.println( "cities is " + cities[i]);
            }else if (cities[i] == "Queens"){
                System.out.println("cities is " + cities[i]);
            }// end of conditions
        }//end of loop
    }//end of main
}//end of class
