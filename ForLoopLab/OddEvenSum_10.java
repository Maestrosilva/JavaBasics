package JavaBasics.ForLoopLab;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 1; i <= n; i++){
            int a = Integer.parseInt(scanner.nextLine());
            if(i % 2 == 0){
                sumEven += a;
            }
            else{
                sumOdd += a;
            }
        }
        int diff = Math.abs(sumEven - sumOdd);
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        }
        else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}