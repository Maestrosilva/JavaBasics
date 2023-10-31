package JavaBasics.NestedLoopsLab;

import java.util.Scanner;

public class Combinations_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int combs = 0;
        for(int a = 0; a <= n; a++) {
            for(int b = 0; b <= n; b++){
                for(int c = 0; c <= n; c++){
                    int f = a + b + c;
                    if(f == n) {
                        combs++;
                    }
                }
            }
        }
        System.out.println(combs);
    }
}