package Action_Items;

public class Action_ItemConditions {
    public static void main(String[] args) {
        int grade = 65;
        //verify if grade is 90 or higher
        if (grade >= 90){
            System.out.println("Grade is A ");
        }else if(grade >= 80 && grade <= 89) {
            System.out.println("Grade is B");
        }else if (grade >= 70 && grade <= 79) {
            System.out.println("Grade is C");
        } else if(grade >= 65 && grade <= 69) {
            System.out.println("Grade is D");
        } else{
            System.out.println("Grade is F");
        }//end of if else statement
    }//end of main
}//end of class
