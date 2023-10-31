package JavaBasics.FirstStepsInCodingExersices;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double kk = Math.floor(a/b);
        System.out.println(Math.floor(kk/c));
    }
}