package JavaBasics.ConditionalStatementsExersices;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int movieLength = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double lunch = length / 8;
        double rest = length / 4;
        double difference = Math.ceil(Math.abs(length - movieLength - rest - lunch));
        if(length >= rest + lunch + movieLength){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movie, difference);
        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movie, difference);
        }
    }
}