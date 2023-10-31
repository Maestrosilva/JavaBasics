package JavaBasics.ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if(figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println(Math.pow(a,2));
        }
        if(figure.equals("circle")) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println(Math.pow(a,2) * Math.PI);
        }
        if(figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(a * b / 2);
        }
        if(figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println(a * b);
        }
    }
}