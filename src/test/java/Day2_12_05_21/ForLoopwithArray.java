package Day2_12_05_21;

public class ForLoopwithArray {
        public static void main(String[] args) {
            //iterate all boroughs defined by the dynamic array using the loop
            String[] borough = new String[6];
            borough[0] = "Brooklyn";
            borough[1] = "Manhattan";
            borough[2] = "Bronx";
            borough[3] = "Queens";
            borough[4] = "Staten";
            borough[5] = "LI";

        for (int i = 0; i < borough.length; i++) {

            //print statment
            System.out.println("My Borough is " + borough[i]);
        }//end of loop


    }//end of main
}//end of class
