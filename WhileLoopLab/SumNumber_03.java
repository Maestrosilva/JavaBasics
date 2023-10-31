package JavaBasics.WhileLoopLab;

import java.util.Scanner;

public class SumNumber_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int sum = n;
        while(sum < goal){
            n= Integer.parseInt(scanner.nextLine());
            sum += n;
        }
        System.out.println(sum);
    }
}