package JavaBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourStart = Integer.parseInt(scanner.nextLine());
        int minuteStart = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minuteArrive = Integer.parseInt(scanner.nextLine());
        int a = hourStart * 60 + minuteStart;
        int b = hourArrive * 60 + minuteArrive;
        int diff = Math.abs(a - b);
        if(a < b){
            System.out.println("Late");
            if(diff < 60){
                System.out.printf("%d minutes after the start", diff);
            }
            else {
                System.out.printf("%d:%02d hours after the start", diff/60, diff%60);
            }
        }
        else if (a - 30 <= b){
            System.out.println("On time");
            if(diff < 60){
                System.out.printf("%d minutes before the start", diff);
            }
            else {
                System.out.printf("%d:%02d hours before the start", diff/60, diff%60);
            }
        }
        else{
            System.out.println("Early");
            if(diff < 60){
                System.out.printf("%d minutes before the start", diff);
            }
            else {
                System.out.printf("%d:%02d hours before the start", diff/60, diff%60);
            }
        }
    }
}