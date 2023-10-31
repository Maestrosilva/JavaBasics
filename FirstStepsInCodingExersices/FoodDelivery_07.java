package JavaBasics.FirstStepsInCodingExersices;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println((a * 10.35 + b*12.4 + c*8.15)*1.2 + 2.5);
    }
}