import java.util.Scanner;

public class Rubric
{
    public static void main(String args[])
    {
    	
        int criteria[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject "+(i+1)+":");
           criteria[i] = scanner.nextInt();
           total = total + criteria[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.print("The student Grade is: " + avg);
      
    }
}


