package JavaBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double n = Double.parseDouble(scanner.nextLine());
        double percent = 0;
        if(n < 0){
            System.out.println("error");
            return;
        }
        switch (town){
            case "Sofia":
                if(n <= 500){
                    percent = 0.05;
                }
                else if(n <= 1000){
                    percent = 0.07;
                }
                else if(n <= 10000){
                    percent = 0.08;
                }
                else{
                    percent = 0.12;
                }
                break;
            case "Varna":
                if(n <= 500){
                    percent = 0.045;
                }
                else if(n <= 1000){
                    percent = 0.075;
                }
                else if(n <= 10000){
                    percent = 0.1;
                }
                else{
                    percent = 0.13;
                }
                break;
            case "Plovdiv":
                if(n <= 500){
                    percent = 0.055;
                }
                else if(n <= 1000){
                    percent = 0.08;
                }
                else if(n <= 10000){
                    percent = 0.12;
                }
                else{
                    percent = 0.145;
                }
                break;
            default:
                System.out.println("error");
                return;
        }
        double price = percent * n;
        System.out.printf("%.2f", price);
    }
}