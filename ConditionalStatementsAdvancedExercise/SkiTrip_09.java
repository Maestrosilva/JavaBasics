package JavaBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine();
        String opinion = scanner.nextLine();
        double price = 0;
        switch (place){
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;
                if(days < 10){
                    price *= 0.7;
                }
                else if(days < 15){
                    price *= 0.65;
                }
                else{
                    price *= 0.5;
                }
                break;
            case "president apartment":
                price = 35;
                if(days < 10){
                    price *= 0.9;
                }
                else if(days < 15){
                    price *= 0.85;
                }
                else{
                    price *= 0.8;
                }
                break;
        }
        price *= days - 1;
        switch (opinion){
            case "positive":
                price *= 1.25;
                break;
            case "negative":
                price *= 0.9;
                break;
        }
        System.out.printf("%.2f", price);
    }
}