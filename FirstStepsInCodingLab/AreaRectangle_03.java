package JavaBasics.FirstStepsInCodingLab;

import java.util.Scanner;

public class AreaRectangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println(Math.round(a * b));
    }
}