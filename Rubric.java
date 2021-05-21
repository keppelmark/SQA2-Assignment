import java.util.Scanner;

public class Rubric {
    public static void main(String[] args) {
        int count = getGrades();
        int sum = getGrades();
        int max =  getGrades();
        int min =  getGrades();
        System.out.println("You entered " + count + " students");
        System.out.println("Class average =" + sum / count);
        System.out.println("Maximum =" + max);
        System.out.println("Minimum ="+ min);

    }

    public static int getGrades() {
        Scanner reader = new Scanner(System.in); {
        int count = 0;
        int sum = 0;
        int min = 100;
        int max = 0;

        while(true) {
            System.out.println("Welcome to the grade calculator. \n Please enter a numeric grade. \n After the last student in the class, enter a grade of -1.");


            int grade = reader.nextInt();



            if (grade >= 90) {
                System.out.println("That's an A");
            } else if (grade >= 80 ) {
                System.out.println("That's a B");
            } else if (grade >= 70) {
                System.out.println("That's a C");
            } else if (grade >= 60) {
                System.out.println("That's a D");
            } else if (grade >= 0) {
                System.out.println("That's an F");
            } else if (grade == -1) {
                return count; 
            }

            if (grade < min){
              min = grade;
            }
            if (grade > max){
              max = grade;}

            count++;
            sum += grade;

        }
    }
}
}


