package JavaBasics.ConditionalStatementsExersices;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec1 = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());
        int sum = sec1 + sec2 + sec3;
        int minutes = sum/60;
//        int second = sum - minutes * 60;
        int second = sum % 60;
        System.out.printf("%d:%02d", minutes, second);
    }
}