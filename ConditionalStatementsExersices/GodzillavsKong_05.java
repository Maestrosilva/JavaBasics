package JavaBasics.ConditionalStatementsExersices;

import java.util.Scanner;

public class GodzillavsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceForStatist = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double moneyForStatists = statists * priceForStatist;
        if(statists > 150){
            moneyForStatists *= 0.9;
        }
        if(budget < moneyForStatists + decor){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyForStatists + decor - budget);
        }
        else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - moneyForStatists - decor);
        }
    }
}