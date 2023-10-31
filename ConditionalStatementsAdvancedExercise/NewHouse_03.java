package JavaBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (flower){
            case "Roses":
                price = 5;
                if(amount > 80){
                    price *= 0.9;
                }
                break;
            case "Dahlias":
                price = 3.8;
                if(amount > 90){
                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = 2.8;
                if(amount > 80){
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = 3;
                if(amount < 120){
                    price *= 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.5;
                if(amount < 80){
                    price *= 1.2;
                }
                break;
        }
        double totalPrice = price * amount;
        double difference = Math.abs(totalPrice - budget);
        if(totalPrice <= budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, flower, difference);
        }
        else{
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}