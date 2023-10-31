package JavaBasics.FirstStepsInCodingLab;

import java.util.Scanner;

public class InchesToCm_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cm = Double.parseDouble(scanner.nextLine());
        System.out.println(cm * 2.54);
    }
}