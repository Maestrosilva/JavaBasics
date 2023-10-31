package JavaBasics.ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            sumLeft += a;
        }
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            sumRight += a;
        }
        int diff = Math.abs(sumLeft - sumRight);
        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        }
        else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}