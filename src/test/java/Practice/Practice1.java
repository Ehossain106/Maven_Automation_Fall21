package Practice;

public class Practice1 {
    public static void main(String[] args) {
        int[] grade = new int[4];
        grade[0] = 101;
        grade[1] = 75;
        grade[2] = 82;
        grade[3] = 98;
        for (int i = 0; i < grade.length; i++) {
            //verify if grade is 90 or higher
            if (grade[i] >= 90) {
                System.out.println("Grade is A ");
            } else if (grade[i] >= 80 && grade[i] <= 89) {
                System.out.println("Grade is B");
            } else if (grade[i] >= 70 && grade[i] <= 79) {
                System.out.println("Grade is C");
            } else if (grade[i] >= 65 && grade[i] <= 69) {
                System.out.println("Grade is D");
            } else {
                System.out.println("Grade is F");
            }//end of if else statement
        }//end of Loop
    }//end of main
}//end of class
