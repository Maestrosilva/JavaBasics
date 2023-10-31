package JavaBasics.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if(n >= 100 && n <= 200 || n == 0){
        }
        else{
            System.out.println("invalid");
        }
    }
}