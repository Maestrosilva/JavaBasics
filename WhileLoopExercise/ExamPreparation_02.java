package JavaBasics.WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bad = false;
        int n = Integer.parseInt(scanner.nextLine());
        int badGrades = 0;
        double problems = 0;
        double sumGrades = 0;
        String name;
        String lastProblem = null;
        while(true){
            name = scanner.nextLine();
            if(name.equals("Enough")){
                break;
            }
            lastProblem = name;
            problems++;
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrades += grade;
            if(grade <= 4){
                badGrades++;
            }
            if(badGrades == n){
                System.out.printf("You need a break, %d poor grades.", badGrades);
                return;
            }
        }
        double average = sumGrades / problems;
        System.out.printf("Average score: %.2f%n", average);
        System.out.printf("Number of problems: %.0f%n", problems);
        System.out.printf("Last problem: %s%n", lastProblem);
    }
}