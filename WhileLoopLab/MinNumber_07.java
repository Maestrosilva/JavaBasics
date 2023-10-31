package JavaBasics.WhileLoopLab;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        String number = scanner.nextLine();
        while(!number.equals("Stop")){
            int n = Integer.parseInt(number);
            if(n < min){
                min = n;
            }
            number = scanner.nextLine();
        }
        System.out.println(min);
    }
}