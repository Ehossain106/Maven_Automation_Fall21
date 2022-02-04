package Action_Items;

public class Action_ItemArray_Loop_Conditions {
    public static void main(String[] args) {
        String[] states = new String[4];
        states[0] = "New York";
        states[1] = "California";
        states[2] = "Florida";
        states[3] = "Dallas";
        for (int i = 0; i < states.length; i++) {
            //two if conditions
            if (states[i] == "New York") {
                System.out.println(" My state is " + states[i]);
            } else if (states[i] == "Florida") {
                System.out.println(" My state is " + states[i]);
            }//end of if conditions
        }//end of loop
    }//end of main
}//end of main
