package Day4_12_12_21;

public class SplitCommand {
    public static void main(String[] args) {
        //create a single string
        String Message = "My name is John";
        //declare String Array to split the message to print out only john
        String[] arrayMessage = Message.split(" ");

        //print out john
        System.out.println("results is " + arrayMessage[3]);

    }//end of main
}//end of class
