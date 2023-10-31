package JavaBasics.NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        for(int rows = 1; rows <= n; rows++){
            for(int cols = 0; cols < rows; cols++){
                System.out.print(number + " ");
                number++;
                if(number > n){
                    return;
                }
            }
            System.out.println();
        }
    }
}