package JavaBasics.FirstStepsInCodingLab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double finalPrice = area * 7.61 * 0.82;
        double discount = area * 7.61 * 0.18;
        System.out.printf("The final price is: %.2f lv.",finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}