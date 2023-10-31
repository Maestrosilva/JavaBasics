package JavaBasics.WhileLoopLab;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String number = scanner.nextLine();
        while(!number.equals("Stop")){
            int n = Integer.parseInt(number);
            if(n > max){
                max = n;
            }
            number = scanner.nextLine();
        }
        System.out.println(max);
    }
}