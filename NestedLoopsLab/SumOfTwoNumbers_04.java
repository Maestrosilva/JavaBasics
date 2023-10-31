package JavaBasics.NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int combs = 0;
        int j = 0;
        int i = 0;
        int m = 0;
        for (i = a; i <= b; i++){
            for (j = a; j <= b; j++){
                m = i + j;
                combs++;
                if(m == n){
                    System.out.printf("Combination N:%d (%d + %d = %d)", combs, i, j, n);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combs, n);
    }
}