package Day2_12_05_21;

public class WhileLoop {
    public static void main(String[] args) {
        //iterate all boroughs defined by the dynamic array using the loop
        String[] borough = new String[6];
        borough[0] = "Brooklyn";
        borough[1] = "Manhattan";
        borough[2] = "Bronx";
        borough[3] = "Queens";
        borough[4] = "Staten";
        borough[5] = "LI";

        //declare and define the initial starting point
        int i = 0;
        //define while loop with your end point
        while (i<borough.length){

            System.out.println("my borough is " + borough[i]);

            i = i+1;//if there is no incrementation, the while loop becomes infinite loop

        }//end of while loop
    }//end of main
}//end of class
