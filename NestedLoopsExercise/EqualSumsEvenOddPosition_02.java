package JavaBasics.NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =Integer.parseInt(scanner.nextLine());
        int b =Integer.parseInt(scanner.nextLine());
        for(int i = a; i <= b; i++){
            int oddSum = 0;
            int evenSum = 0;
            String num = "" + i;

            for(int j = 0; j < num.length(); j++){
                int current = Integer.parseInt("" + num.charAt(j));
                if(j % 2 == 0){
                    oddSum +=  current;
                }
                else{
                    evenSum += current;
                }
            }
            if(oddSum == evenSum){
                System.out.print(i + " ");
            }
        }
    }
}