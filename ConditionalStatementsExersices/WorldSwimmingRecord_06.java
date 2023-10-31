package JavaBasics.ConditionalStatementsExersices;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double speed = Double.parseDouble(scanner.nextLine());
        double time = speed * distance;
        double slows = Math.floor(distance / 15);
        time += slows * 12.5;
        if(time < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        }
        else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - record);
        }
    }
}