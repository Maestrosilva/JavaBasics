package JavaBasics.FirstStepsInCodingExersices;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double d = Double.parseDouble(scanner.nextLine());
        System.out.println((a*b*c/1000)*(1-d/100));
    }
}