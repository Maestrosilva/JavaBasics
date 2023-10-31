package JavaBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = null;
        String place = "Hotel";
        double price = 0;
        if(budget <= 100){
            destination = "Bulgaria";
            switch (season){
                case "winter":
                    price = 0.7;
                    break;
                case "summer":
                    price =0.3;
                    place = "Camp";
                    break;
            }
        }
        else if (budget <= 1000){
            destination = "Balkans";
            switch (season){
                case "winter":
                    price = 0.8;
                    break;
                case "summer":
                    price =0.4;
                    place = "Camp";
                    break;
            }
        }
        else{
            destination = "Europe";
            price = 0.9;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, budget * price);
    }
}