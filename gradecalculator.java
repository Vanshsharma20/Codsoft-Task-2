import java.util.Scanner;
public class gradecalculator{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello,Enter the no. of subjects:");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        //we will assume total marks =0
        int totalMarks =0;

        for(int i=0;i<numSubjects;i++){
            System.out.println("Enter marks obtained in each Subject" + (i+1) + ":");
            marks[i] = sc.nextInt();
            totalMarks = totalMarks + marks[i];

        }
        double averagePercentage = (double) totalMarks / (numSubjects*100)*100;
        System.out.println("Heyy! Your Result is here:");
        System.out.println("Your Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade:  " + grade);
        sc.close();    
    }

    public static String calculateGrade(double percentage){
        if(percentage>=90){
            return "Congratulations! You score A++ grade ";
        }
        else if(percentage>=80){
            return " A ";
        }
        else if(percentage>=70){
            return " B ";
        }
        else if(percentage>=60){
            return " C ";
        }
        else if(percentage>=50){
            return " D ";
        }
        else{
            return "You score F grade.Need Improvement";
        }
    }
}