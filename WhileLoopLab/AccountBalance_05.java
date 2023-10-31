package JavaBasics.WhileLoopLab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String income = scanner.nextLine();
        double sum = 0;
        while(!income.equals("NoMoreMoney")){
            double money = Double.parseDouble(income);
            if(money < 0){
                System.out.println("Invalid operation!");
                break;}
            sum += money;
            System.out.printf("Increase: %.2f%n", money);
            income = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}