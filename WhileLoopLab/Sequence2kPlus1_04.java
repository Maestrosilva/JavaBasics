package JavaBasics.WhileLoopLab;

import java.util.Scanner;

public class Sequence2kPlus1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        while(num <= n){
            System.out.println(num);
            num = 1 + 2 * num;
        }
    }
}