package JavaBasics.FirstStepsInCodingExersices;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double d = Double.parseDouble(scanner.nextLine());
        System.out.println((a * 5.8 + b * 7.2 + c * 1.2) * (1 - d/100));
    }
}