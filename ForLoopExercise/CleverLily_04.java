package JavaBasics.ForLoopExercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double dollPrice = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        int dolls = 0;
        int cash = 0;
        for(int i = 1; i <= age; i++){
            if(i % 2 != 0){
                dolls++;
            }
            else{
                cash++;
                sum += 10 * cash - 1;
            }
        }
        sum += dollPrice * dolls;
        double diff = Math.abs(sum - price);
        if(sum >= price){
            System.out.printf("Yes! %.2f", diff);
        }
        else{
            System.out.printf("No! %.2f", diff);
        }
    }
}