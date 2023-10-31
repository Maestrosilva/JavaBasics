package JavaBasics.NestedLoopsLab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = null;
        double money;
        double needs;
        double totalMoney = 0;
        while (true) {
            destination = scanner.nextLine();
            if (destination.equals("End")) {
                break;
            }
            needs = Double.parseDouble(scanner.nextLine());
            while (true) {
                money = Double.parseDouble(scanner.nextLine());
                totalMoney += money;
                if (totalMoney >= needs) {
                    System.out.printf("Going to %s!%n",destination );
                    totalMoney = 0;
                    break;
                }
            }
        }
    }
}