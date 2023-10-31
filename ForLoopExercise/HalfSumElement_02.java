package JavaBasics.ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<= n; i++){
            int a = Integer.parseInt(scanner.nextLine());
            sum += a;
            if(a > max){
                max = a;
            }
        }
        double diff = Math.abs(max - sum + max);
        if(max == sum / 2){
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        }
        else{
            System.out.println("No");
            System.out.printf("Diff = %.0f", diff);
        }
    }
}