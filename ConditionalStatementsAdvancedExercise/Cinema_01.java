package JavaBasics.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int area = rows * columns;
        double income = 0;
        switch (name){
            case "Premiere":
                income = area * 12;
                break;
            case "Normal":
                income = area * 7.5;
                break;
            case "Discount":
                income = area * 5;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}