package JavaBasics.WhileLoopLab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int strikes = 0;
        double totalGrade = 0;
        int clas = 0;
        int tries = 0;
        while(clas < 12){
            tries++;
            double grade = Double.parseDouble(scanner.nextLine());
            totalGrade += grade;
            if(grade < 4){
                strikes++;
            }
            else{
                clas++;
            }
            if(strikes == 2){
                System.out.printf("%s has been excluded at %d grade", name, clas + 1);
                return;
            }
        }
        double average = totalGrade / clas;
        System.out.printf("%s graduated. Average grade: %.2f", name, average);
    }
}