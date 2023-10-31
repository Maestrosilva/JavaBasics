package JavaBasics.FirstStepsInCodingExersices;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double d = Double.parseDouble(scanner.nextLine());
        double f = (a+2)*1.5 + b*1.1*14.5 + c*5+0.4;
        System.out.println(f + f*0.3*d);
    }
}