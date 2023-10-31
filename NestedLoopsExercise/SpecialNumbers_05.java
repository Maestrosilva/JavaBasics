package JavaBasics.NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int specialNumber = Integer.parseInt(scanner.nextLine());
        for(int i = 1111; i <= 9999; i++){
            boolean N = false;
            String number = null;
            number = "" + i;
            for(int j = 0; j < 4; j++){
                int digit = Integer.parseInt("" + number.charAt(j));
                if(digit == 0){
                    break;
                }
                if(specialNumber % digit != 0){
                    break;
                }
                if(j == 3){
                    N = true;
                }
            }
            if(N){
                System.out.print(number +" ");
            }
        }
    }
}