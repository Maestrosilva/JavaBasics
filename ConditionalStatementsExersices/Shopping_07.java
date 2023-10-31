package JavaBasics.ConditionalStatementsExersices;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int P = Integer.parseInt(scanner.nextLine());
        double PriceN = N * 250;
        double PriceM = PriceN * 0.35 * M;
        double PriceP = PriceN * 0.1 * P;
        double totalPrice = PriceM + PriceP + PriceN;
        if(N > M){
            totalPrice *= 0.85;
        }
        if(budget >= totalPrice){
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        }
        else{
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}