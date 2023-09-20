import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOfStudents;
        int studentGrades;

        List<Integer> grades = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of students ");
        numberOfStudents = scan.nextInt();

        for(int i = 0 ; i < numberOfStudents ; i++){
            System.out.println((i+1) + ". grade: ");
            studentGrades = scan.nextInt();
            grades.add(i,studentGrades);
        }

        Result.gradingStudents(grades);

        for (Integer grade:grades) {
            System.out.println(grade);
        }

    }
}