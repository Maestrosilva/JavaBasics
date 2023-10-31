package JavaBasics.ForLoopExercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(scanner.nextLine());
            if(a < 200){
                p1 ++;
            }
            else if(a < 400){
                p2 ++;
            }
            else if (a < 600){
                p3 ++;
            }
            else if(a < 800){
                p4 ++;
            }
            else {
                p5 ++;
            }
        }
        double per1 = p1 / n * 100;
        double per2 = p2 / n * 100;
        double per3 = p3 / n * 100;
        double per4 = p4 / n * 100;
        double per5 = p5 / n * 100;
        System.out.printf("%.2f%%%n", per1);
        System.out.printf("%.2f%%%n", per2);
        System.out.printf("%.2f%%%n", per3);
        System.out.printf("%.2f%%%n", per4);
        System.out.printf("%.2f%%%n", per5);
    }
}