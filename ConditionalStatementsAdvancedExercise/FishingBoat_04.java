package JavaBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (season){
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if(fishermen <= 6){
            price *= 0.9;
        }
        else if (fishermen <= 11){
            price *= 0.85;
        }
        else {
            price *= 0.75;
        }
        if(!(season.equals("Autumn")) && fishermen % 2 == 0){
            price *= 0.95;
        }
        double diff = Math.abs(budget - price);
        if(budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }
        else{
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}