package Day3_12_11_21;

public class Return_Method {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        int value = Reusable_Methods.addReturn(a,b);

        System.out.println("My new value is " + (value+200));
    }//end of main
}//end of class
