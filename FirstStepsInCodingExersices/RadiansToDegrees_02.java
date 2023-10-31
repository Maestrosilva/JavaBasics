package JavaBasics.FirstStepsInCodingExersices;

import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rads = Double.parseDouble(scanner.nextLine());
        System.out.println(rads * 180/Math.PI);
    }
}