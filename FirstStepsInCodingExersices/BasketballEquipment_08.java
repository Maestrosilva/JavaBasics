package JavaBasics.FirstStepsInCodingExersices;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = a * 0.6;
        double c = b * 0.8;
        System.out.println(a + b + c + c/4 + c/20);
    }
}