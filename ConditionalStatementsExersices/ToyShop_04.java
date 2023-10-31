package JavaBasics.ConditionalStatementsExersices;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeed = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());
        double puzzlePrice = puzzle * 2.6;
        double dollPrice = doll * 3;
        double bearPrice = bear * 4.1;
        double minionPrice = minion * 8.2;
        double truckPrice = truck * 2;
        double totalPrice = truckPrice + minionPrice + bearPrice + dollPrice + puzzlePrice;
        if(puzzle + doll + bear + minion + truck >= 50){
            totalPrice *= 0.75;
        }
        totalPrice *= 0.9;
        if(totalPrice >= moneyNeed){
            System.out.printf("Yes! %.2f lv left.",totalPrice - moneyNeed);
        }
        else{
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeed - totalPrice);
        }
    }
}