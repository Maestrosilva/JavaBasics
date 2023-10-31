package JavaBasics.ConditionalStatementsExersices;

import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int finalTime = hours * 60 + minutes + 15;
        int finalHours = finalTime/60;
        int finalMinutes = finalTime%60;
        if(finalHours >= 24){
            finalHours = 0;
            System.out.printf("%d:%02d",finalHours,finalMinutes);
        }
        else{
            System.out.printf("%d:%02d",finalHours,finalMinutes);
        }
    }
}