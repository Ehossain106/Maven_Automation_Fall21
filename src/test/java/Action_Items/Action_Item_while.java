package Action_Items;

public class Action_Item_while {
    public static void main(String[] args) {
        //create a string dynamic array for Zipcode
        String[] zipcode = new String[4];// set the boundaries for your array
        //how you define your values by the varibles indexing
        zipcode[0] = "11218";
        zipcode[1] = "10022";
        zipcode[2] = "10003";
        zipcode[3] = "11215";

        //create a string dynamic array for your streetnumber
        int[] Streetnumber = new int[4];
        Streetnumber[0] = 123;
        Streetnumber[1] = 321;
        Streetnumber[2] = 246;
        Streetnumber[3] = 139;

        int i = 0;
        while (i < zipcode.length) {

            System.out.println("My Zipcode is " + zipcode[i] + " and my streetnumber is " + Streetnumber[i]);

            i = i + 1;
        }//end of loop

    }//end of main
}// end of class

